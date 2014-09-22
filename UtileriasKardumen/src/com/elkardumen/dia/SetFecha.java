
package com.elkardumen.dia;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SetFecha {

	public static void main(String args[]){
		
		try{
		 SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
     	String dateInString = "09-05-2014 11:56:00";
     	Date date = sdf.parse(dateInString);
     	System.out.println(date);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
