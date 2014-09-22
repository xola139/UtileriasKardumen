package com.elkardumen.stringTo;

public class StringTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "100";

	      try {
	         long l = Long.parseLong(s);
	         System.out.println("long l = " + l);
	      } catch (NumberFormatException nfe) {
	         System.out.println("NumberFormatException: " + nfe.getMessage());
	      }

	}

}
