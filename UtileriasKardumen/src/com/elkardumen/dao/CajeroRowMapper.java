package com.elkardumen.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class CajeroRowMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		CodigoCajero cajero = new CodigoCajero();
		
		cajero.setIdcodigocajero(rs.getInt("IDCODIGOCAJERO"));
		cajero.setCajero(rs.getString("CAJERO"));
		cajero.setFecha(rs.getTimestamp("FECHA"));
		cajero.setEstatus(rs.getString("ESTATUS"));
		return cajero;
	}
	
}
