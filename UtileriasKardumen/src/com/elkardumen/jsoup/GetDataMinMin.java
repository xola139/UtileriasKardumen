package com.elkardumen.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetDataMinMin {
	
	public static void main(String args[]){
		
		Document doc;
		try {
			
//			System.setProperty("http.proxyHost", "127.0.0.1");
//			System.setProperty("http.proxyPort", "9150");
//			
			
//			System.getProperties().put( "proxySet", "true" );
//			System.getProperties().put( "socksProxyHost", "127.0.0.1" );
//			System.getProperties().put( "socksProxyPort", "9150" );
		
		doc = Jsoup.connect("http://espndeportes.espn.go.com/futbol/comentario?id=383302").get();

		//Elements elementos=doc.select("li[id^=0-comment]");
		Elements elementos=doc.select("ul#convo-list").select("li");
		System.out.println(elementos.size());
		
		for (Element table : elementos) {
	    	System.out.println(table.select("div.comment").select("p"));
		}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
