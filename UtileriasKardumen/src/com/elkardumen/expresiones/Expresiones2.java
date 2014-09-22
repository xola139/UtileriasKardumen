package com.elkardumen.expresiones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expresiones2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String llega="Possible error message logged earlier indicating the reason for the           Fatal Error";
		
		Pattern p2 = Pattern.compile(".*Fatal Error, Bank B072 will not be processed.*");
        Matcher result2 = p2.matcher(llega);
        
        Pattern p3 = Pattern.compile(".*Possible error message logged earlier indicating the reason for the           Fatal Error.*");
        Matcher result3 = p3.matcher(llega);
        
        Pattern p4 = Pattern.compile(".*Correct problem and 'WARMBOOT' FI.*");
        Matcher result4 = p4.matcher(llega);
        
        if(result2.find() || result3.find() || result4.find()){
        	System.out.println(">>>>");
        }
	}

}
