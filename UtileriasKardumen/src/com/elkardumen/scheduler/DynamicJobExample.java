package com.elkardumen.scheduler;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.CronTriggerBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;

public class DynamicJobExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 ClassPathResource res = new ClassPathResource("dynamic-jobs.xml");
         XmlBeanFactory factory = new XmlBeanFactory(res);

         //get the quartzFactory bean
         Scheduler scheduler = (Scheduler) factory.getBean("scheduler");

         //get the task bean
         MyTask myTask = (MyTask) factory.getBean("myTask");

         try {
         // create JOB
         MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
         jobDetail.setTargetObject(myTask);
         jobDetail.setTargetMethod("performAction");
         jobDetail.setName("MyJobDetail");
         jobDetail.setConcurrent(false);
         jobDetail.afterPropertiesSet();

         /* SimpleTriggerBean trigger = new SimpleTriggerBean();
         trigger.setBeanName("MyTrigger");
         trigger.setJobDetail((JobDetail) jobDetail.getObject());
         trigger.setRepeatInterval(5000);
         trigger.afterPropertiesSet();
         */

         // create CRON Trigger
         CronTriggerBean cronTrigger = new CronTriggerBean();
         cronTrigger.setBeanName("CRON0001");

         // Execute after each 5 second
//         String expression = "5 * * * * ?";
         String expression = "10 0/1 * * * ?";
         cronTrigger.setCronExpression(expression);
         cronTrigger.afterPropertiesSet();

         //scheduler.scheduleJob(jobDetail, cronTrigger);

         scheduler.scheduleJob((JobDetail) jobDetail.getObject(), cronTrigger);

         // Start Scheduler        
         scheduler.start();

         } catch (Exception e) {                      
             e.printStackTrace();
         } 
	}

}
