package com.elkardumen.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetData {
	
	public static void main(String args[]){
		
		Document doc;
		try {
//			System.setProperty("http.proxyHost", "127.0.0.1");
//			System.setProperty("http.proxyPort", "9666");
//			
		doc = Jsoup.connect("http://15.128.1.44:2580/available-portal/").get();
		//http://espndeportes.espn.go.com/futbol/gamecast?id=392761&league=MEX.1
		//doc = Jsoup.connect("http://espndeportes.espn.go.com/futbol/fixtures?league=MEX.1&cc=5200").get();
		String idJuego="";

		System.out.println(doc);
//	    for (Element table : doc.select("table.tablehead")) {
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
//	    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
