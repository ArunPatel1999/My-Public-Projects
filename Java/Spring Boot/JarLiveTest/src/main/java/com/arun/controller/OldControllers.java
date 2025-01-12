package com.arun.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

//@Controller
//@RequestMapping("/jsiofuhui")
public class OldControllers {

	@GetMapping
	public String getIndex(Model model) {
		model.addAttribute("run", "Normal");
		return "index";
	}

	@GetMapping("/log")
	public String getIndex() {
		return "log";
	}

	@PostMapping("/upload")
	public String startUploadIng(@PathParam("name") String name, @PathParam("port") int port,
			@RequestParam("jar") MultipartFile jar, Model model) throws IOException {
		uploadJar(jar, name);
		model.addAttribute("run", startCmd("D:/Download/"+name));
		return "index";
	}

	private String uploadJar(MultipartFile jar, String name) throws IOException {
		String destination = "D:/Download";
		File file = new File(destination);
		
		if (!file.exists()) {
			file.mkdirs();
		}
		String filename = name + ".jar";
		byte[] bytes = jar.getBytes();
		String insPath = destination + "/" + filename;// Directory path where you want to save ;
		Files.write(Paths.get(insPath), bytes);
		return filename;
	}

	
	private List<String> startCmd(String locatrion) throws IOException {
		List<String> list = new LinkedList<>();
		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c",
				"java -jar "+locatrion+".jar");
		builder.redirectErrorStream(true);
		Process p = builder.start();
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
	    while (true) {
            line = r.readLine();
            list.add(line);
            if (line == null || line.contains(" Started ")) { break; }
           
        }
        return list;
	}

	
}
