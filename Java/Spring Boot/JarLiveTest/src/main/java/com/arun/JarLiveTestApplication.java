package com.arun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class JarLiveTestApplication {

	@GetMapping
	public String getData() {
		return "index";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JarLiveTestApplication.class, args);
	}

}
