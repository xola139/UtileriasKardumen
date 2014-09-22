package com.elkardumen.scheduler;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;

public class Ejemplo1 {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		
		
		  SchedulerFactory schedFact = new org.quartz.impl.StdSchedulerFactory();
	        try {

	            Scheduler sched = schedFact.getScheduler();
	            sched.start();

	            JobDetail jobd = new JobDetail("instruccion", "instrucciones",Mensaje.class);

//	          TriggerExample trigger = new TriggerExample("instruccion",
//	                  "instrucciones");
	            
	            System.out.println("===="+Calendar.getInstance().getTime());
	            System.out.println("===="+Calendar.getInstance().getTime());

	            
	            
	            SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	        	String dateInString = "09-05-2014 11:56:00";
	        	Date date = sdf.parse(dateInString);
	        	System.out.println(date);
	            
	            jobd.setRequestsRecovery(true);
	            SimpleTrigger trigger2 = new SimpleTrigger("lanzador principal", "lanzadores", "instruccion","instrucciones" , Calendar.getInstance().getTime(), date, 1, 10000);

	            trigger2.setMisfireInstruction(SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW);
	            sched.scheduleJob(jobd, trigger2);

	            //      
	            // }
	        } catch (SchedulerException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
	}

}
