package com.elkardumen.dao;

import java.sql.Timestamp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String args[]){
		ClassPathXmlApplicationContext ctx;
		ICrudDAO dao;
		
		try {
			ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			dao = (CrudDAO) ctx.getBean("crudDAO");
			
			int consecutivo=dao.selectMaxIdcodigoCajero();
			CodigoCajero msjalert=new CodigoCajero();
			msjalert.setIdcodigocajero(consecutivo);
			msjalert.setCajero("N00001");
			msjalert.setFecha(new Timestamp(System.currentTimeMillis()));
			msjalert.setEstatus("ENVIO");
			
			dao.insertAlert(msjalert);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
