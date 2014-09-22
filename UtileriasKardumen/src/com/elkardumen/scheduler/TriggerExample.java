package com.elkardumen.scheduler;

import java.util.Date;

import org.quartz.Calendar;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Trigger;

public class TriggerExample extends Trigger {

	
	 /**
     * 
     */
    private static final long serialVersionUID = -4926331843008217753L;

    Date fechaAEjecutar;


    public TriggerExample(){

        super();
    }

    public TriggerExample(String name){
        super(name, name);
    }

    public TriggerExample(String name, String group){
        super(name, group);
    }

    public TriggerExample(String name, String group,String jobname, String jobgroup){
        super(name,group,jobname,jobgroup);
    }



    @Override
    public Date computeFirstFireTime(Calendar arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int executionComplete(JobExecutionContext arg0,
            JobExecutionException arg1) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Date getEndTime() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Date getFinalFireTime() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Date getFireTimeAfter(Date arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Date getNextFireTime() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Date getPreviousFireTime() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Date getStartTime() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean mayFireAgain() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setEndTime(Date arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setStartTime(Date arg0) {
        this.fechaAEjecutar = arg0;
        System.out.println("Cargue la fecha el data con valor\n");
        System.out.println(this.fechaAEjecutar.getTime());

    }

    @Override
    public void triggered(Calendar arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateAfterMisfire(Calendar arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateWithNewCalendar(Calendar arg0, long arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    protected boolean validateMisfireInstruction(int arg0) {
        // TODO Auto-generated method stub
        return false;
    }

}
