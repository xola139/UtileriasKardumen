package com.elkardumen.proxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class ExampleProxy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	try{
		
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 9666));
	
		URL url = new URL("http://www.webbizarro.com/");
		URLConnection yc = url.openConnection(proxy);

		StringBuffer sb=new StringBuffer();

		BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
		String inputLine;

		while ((inputLine = in.readLine()) != null) {
		       sb.append(inputLine);
		       System.out.println(inputLine);
		}

		String res = sb.toString();
	}catch(Exception e){
		e.printStackTrace();
	}
	}

}
