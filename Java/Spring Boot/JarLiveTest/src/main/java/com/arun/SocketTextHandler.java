package com.arun;

import java.io.IOException;
import java.io.RandomAccessFile;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class SocketTextHandler extends TextWebSocketHandler {

	private boolean stop ;
	
	
	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message)
			throws InterruptedException, IOException {

		RandomAccessFile bufferedReader = new RandomAccessFile( "D:/Demo.log", "r" );

		long filePointer;
		while ( !stop ) {
		    final String string = bufferedReader.readLine();
		
		    if ( string != null )
		    	session.sendMessage(new TextMessage(string));
		    else {
		        filePointer = bufferedReader.getFilePointer();
		        bufferedReader.close();
		        Thread.sleep( 2500 );
		        bufferedReader = new RandomAccessFile(  "D:/Demo.log", "r" );
		        bufferedReader.seek( filePointer );
		    }		    
		}

		bufferedReader.close();

	}

}