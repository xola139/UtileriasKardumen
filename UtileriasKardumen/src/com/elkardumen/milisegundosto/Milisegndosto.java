package com.elkardumen.milisegundosto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Milisegndosto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long millis=1310L;
		        if(millis < 0)
		        {
		            throw new IllegalArgumentException("Duration must be greater than zero!");
		        }

		        long days = TimeUnit.MILLISECONDS.toDays(millis);
		        millis -= TimeUnit.DAYS.toMillis(days);
		        long hours = TimeUnit.MILLISECONDS.toHours(millis);
		        millis -= TimeUnit.HOURS.toMillis(hours);
		        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
		        millis -= TimeUnit.MINUTES.toMillis(minutes);
		        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);
		        

		        StringBuilder sb = new StringBuilder(64);
		        sb.append(days);
		        sb.append(" Days ");
		        sb.append(hours);
		        sb.append(" Hours ");
		        sb.append(minutes);
		        sb.append(" Minutes ");
		        sb.append(seconds);
		        sb.append(" Seconds  ");
		        
		        
		        System.out.println(sb);
		    

		        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//		        Calendar cal = Calendar.getInstance();
		        System.out.println(dateFormat.format(1396482299341L));
		        
	}

}
