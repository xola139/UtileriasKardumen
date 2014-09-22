package com.elkardumen.exec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcenCommand {

	public static void main(String[] args) throws InterruptedException {
		
		Runtime run = Runtime.getRuntime();
		Process p = null;  
		String cmd = "pwd";  
		try {  
		    p = run.exec(cmd);  
		    
		    String s;
		    
		    BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    while ((s = stdInput.readLine()) != null) {
		            System.out.println(s);
		    }
		    
		    p.getErrorStream();
		    p.waitFor();

		}  
		catch (IOException e) {  
		    e.printStackTrace();  
		    System.out.println("ERROR.RUNNING.CMD");  

		}finally{
		    p.destroy();
		}  

	}

}
