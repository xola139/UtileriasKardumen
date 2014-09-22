package com.elkardumen.expresiones;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expresiones {

	/**
	 * @param args
	 */
	  public static final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";

	  public static void main(String[] args) {
	    Pattern pattern = Pattern.compile("\\w+");
	    // in case you would like to ignore case sensitivity,
	    // you could use this statement:
	    // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(EXAMPLE_TEST);
	    // check all occurance
	    while (matcher.find()) {
	      System.out.print("Start index: " + matcher.start());
	      System.out.print(" End index: " + matcher.end() + " ");
	      System.out.println(matcher.group());
	    }
	    // now create a new pattern and matcher to replace whitespace with tabs
	    Pattern replace = Pattern.compile("\\s+");
	    Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
	    System.out.println(matcher2.replaceAll("\t"));
	    
	    
	    String input = "14-04-03;10:53:17.592 \\BNORTE.$PFN8     ACI.SKEL-U.1000         6481                  FROM: P1F^N508          RE: N10022           Uns:card rd/wr : Device status 9, No smart card response,           M-data=7020000000  [NATIVE]NNDC12*000**D9*2*817020000000*0";
	    Pattern p = Pattern.compile("6481");
		Matcher m = p.matcher(input);
		while (m.find()) {
			System.out.println("Found a " + m.group(0));
			
		}
	    /////////////////////
		
	
	    
	  }
}
