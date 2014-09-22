package com.elkardumen.scheduler;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Mensaje implements Job {

	@Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        System.out.println("Hola Mundo");

    }

}
