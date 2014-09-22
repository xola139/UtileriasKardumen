package com.elkardumen.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetDataImg {
	
	public static void main(String args[]){
		
		Document doc;
		try {
//			System.setProperty("http.proxyHost", "127.0.0.1");
//			System.setProperty("http.proxyPort", "9666");
//			
		doc = Jsoup.connect("http://15.156.24.35:8052/KardumenLectura/prueba.html").get();
		
		String idJuego="";

		Elements tds = doc.select("img.badge-item-img");
		System.out.println(tds.size());
				
	    for (Element table : doc.select("img.badge-item-img")) {
	    	
	    	System.out.println(table);
//	        for (Element row : table.select("tr")) {
//	            	Elements tds = row.select("td");
//	            
//	            if (tds.size() > 1) {
//	            	
//	            	String absHref[] =  tds.get(2).select("a").attr("href").split("/");
//	                if(absHref.length>1)
//	                	idJuego=absHref[absHref.length-1];
//	                   System.out.println(tds.get(0).text() + ":" + tds.get(1).text() + ":" + tds.get(2).text() + ":" + tds.get(3).text() + ":" + tds.get(4).text()+"-----"+idJuego);
//	                   
//	            }
//	        }
	    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
