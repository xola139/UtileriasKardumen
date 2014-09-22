package com.elkardumen.dao;

import java.util.List;



public interface ICrudDAO {



	public void insertAlert(CodigoCajero msjalert);
	public int selectMaxIdcodigoCajero();
	public void updateAlert(CodigoCajero msjalert);
	public CodigoCajero findByCajeroId(int custId);
	public CodigoCajero findByCajeroId2(int custId);
	public List<CodigoCajero> findAll();
	public List<CodigoCajero> findAll2();
	
}
