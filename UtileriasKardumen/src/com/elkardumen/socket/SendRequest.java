package com.elkardumen.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.URLEncoder;

public class SendRequest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	try{	
		String data = URLEncoder.encode("key1", "UTF-8") + "=" + URLEncoder.encode("value1", "UTF-8");
	    
	    Socket socket = new Socket("127.0.0.1", 8088);

	    String path = "/servlet";
	    BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF8"));
	    wr.write("POST " + path + " HTTP/1.0\r\n");
	    wr.write("Content-Length: " + data.length() + "\r\n");
	    wr.write("Content-Type: application/x-www-form-urlencoded\r\n");
	    wr.write("\r\n");

	    wr.write(data);
	    wr.flush();

	    BufferedReader rd = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	    String line;
	    while ((line = rd.readLine()) != null) {
	      System.out.println(line);
	    }
	    wr.close();
	    rd.close();
	  }catch (Exception we){
		
	}

	}

}
