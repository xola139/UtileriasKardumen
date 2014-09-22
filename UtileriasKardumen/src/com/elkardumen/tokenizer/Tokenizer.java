package com.elkardumen.tokenizer;

import java.util.StringTokenizer;

public class Tokenizer {

	
	
	
	public static void main(String args[]){
		
		
		String nombre="GALOVARGAS19 por boton de Salir";
		StringTokenizer tokens=new StringTokenizer(nombre);
		while(tokens.hasMoreTokens()){
	            System.out.println(tokens.nextToken());
	        }
		
	}
}
