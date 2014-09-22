package com.elkardumen.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;



public class CrudDAO implements ICrudDAO {

	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertAlert(CodigoCajero msjalert) {
              
//		
//		String sql = "INSERT INTO CUSTOMER " +"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
//		getJdbcTemplate().update(sql, new Object[] { customer.getCustId(),customer.getName(),customer.getAge()});
		
        String insert = "INSERT INTO CODIGOS_GENERADOS(idcodigocajero,cajero,fecha,estatus)VALUES (?,?,?,? )";
        int res = this.jdbcTemplate.update(insert,new Object[]{msjalert.getIdcodigocajero(),msjalert.getCajero(),msjalert.getFecha(),msjalert.getEstatus()});
		
	}
	
	@Override
	public void updateAlert(CodigoCajero objeto) {
		String update = "update CODIGOS_GENERADOS set estatus='"+objeto.getEstatus()+"' where cajero='"+objeto.getCajero()+"'";
        int res = this.jdbcTemplate.update(update);
	}
	
	@Override
	public int selectMaxIdcodigoCajero(){
		try{
			String selectCount = "select count(idcodigocajero)+1  contador from CODIGOS_GENERADOS";
	        int res = this.jdbcTemplate.queryForInt(selectCount);
			return res;	
		}catch (Exception e){
			e.printStackTrace();
			return 0;
		}
		
	}
	
	
	
	//query single row with RowMapper
	
	public CodigoCajero findByCajeroId(int custId){
			 
			String sql = "SELECT * FROM CODIGOS_GENERADOS WHERE IDCODIGOCAJERO = ?";
			CodigoCajero cajero = (CodigoCajero)getJdbcTemplate().queryForObject(sql, new Object[] { custId }, new CajeroRowMapper());
		
			return cajero;
		}
		
		//query single row with BeanPropertyRowMapper (Customer.class)
		public CodigoCajero findByCajeroId2(int custId){
			 
			String sql = "SELECT * FROM CODIGOS_GENERADOS WHERE IDCODIGOCAJERO = ?";
			CodigoCajero cajero = (CodigoCajero)getJdbcTemplate().queryForObject(sql, new Object[] { custId },new BeanPropertyRowMapper(CodigoCajero.class));
		
			return cajero;
		}
		
		//query mutiple rows with manual mapping
		public List<CodigoCajero> findAll(){
			
			String sql = "SELECT * FROM CODIGOS_GENERADOS";
			 
			List<CodigoCajero> cajeross = new ArrayList<CodigoCajero>();
		
			List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
			
			for (Map row : rows) {
				CodigoCajero cajero = new CodigoCajero();
//				customer.setCustId((Long)(row.get("CUST_ID")));
//				customer.setName((String)row.get("NAME"));
//				customer.setAge((Integer.parseInt(row.get("AGE").toString())));
//				customers.add(customer);
			}
//			
			return cajeross;
		}
		
		//query mutiple rows with BeanPropertyRowMapper (Customer.class)
		public List<CodigoCajero> findAll2(){
			
			String sql = "SELECT * FROM CODIGOS_GENERADOS";
			List<CodigoCajero> customers  = getJdbcTemplate().query(sql,new BeanPropertyRowMapper(CodigoCajero.class));
			return customers;
		}
		
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	




}
