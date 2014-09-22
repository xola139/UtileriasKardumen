package com.elkardumen.dao;

import java.sql.Timestamp;

public class CodigoCajero {


	private int idcodigocajero;
	private String cajero;
	private Timestamp fecha; 
	private String estatus;

	
	  public int getIdcodigocajero() {
		return idcodigocajero;
	}
	public void setIdcodigocajero(int idcodigocajero) {
		this.idcodigocajero = idcodigocajero;
	}
	public String getCajero() {
		return cajero;
	}
	public void setCajero(String cajero) {
		this.cajero = cajero;
	}
	public Timestamp getFecha() {
		return fecha;
	}
	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	


}
