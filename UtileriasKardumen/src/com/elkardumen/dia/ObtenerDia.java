package com.elkardumen.dia;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ObtenerDia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				Date now = new Date();
				DateFormat df =  DateFormat.getDateInstance();
				DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL);
				DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
				DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
				DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
				String s =  df.format(now);
				//String fecha = df1.format(milisegundos);
				String s2 = df2.format(now);
				String s3 = df3.format(now);
				String s4 = df4.format(now);
				System.out.println("(Default) Hoy es:" + s);
				//System.out.println("(FULL)   >>>>>>>>>>>>>><<Hoy es:" + fecha2);
				System.out.println("(MEDIUM)  Hoy es:" + s2);
				System.out.println("(LONG)    Hoy es:" + s3);
				System.out.println("(FULL)    Hoy es:" + s4);
			
				System.out.println("(Default) Hoy es:" + df.getCalendar().DAY_OF_WEEK_IN_MONTH);
				
				
				Date curr = new Date();
				Calendar cal = Calendar.getInstance();
				cal.setTime(curr);
				int nweek = cal.WEEK_OF_YEAR;
				int year = cal.YEAR;
				
				System.out.println(cal.DAY_OF_WEEK);
				
				
				
				Calendar ca1 = new GregorianCalendar();
				ca1.setTime(new Date());
				/*
		        Sunday Day of Week 1
		        Monday Day of Week 2
		        Tuesday Day of Week 3
		        Wednesday Day of Week 4
		        Thrusday Day of Week 5
		        Friday Day of Week 6
		        Saturday Day of Week 7
		        */

		        int DAY_OF_WEEK=ca1.get(Calendar.DAY_OF_WEEK);

		        System.out.println("DAY OF WEEK :"+DAY_OF_WEEK);
		    

		        
		        Calendar c1 = GregorianCalendar.getInstance();
		        System.out.println("Fecha actual: "+c1.getInstance().getTime());
		        
	}

}
