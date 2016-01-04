package com.amol.exercise.sales.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.amol.exercise.sales.model.SalesEntry;

public class SalesEntryMapper implements RowMapper<SalesEntry> {

	public SalesEntry mapRow(ResultSet rs, int arg1) throws SQLException {
		SalesEntry salesEntry = new SalesEntry();
		salesEntry.setSalesId(rs.getInt("SalesID"));
		salesEntry.setDateofSale(rs.getDate("DateofSale"));
		salesEntry.setItemsSold(rs.getInt("ItemsSold"));
		salesEntry.setProductID(rs.getInt("ProductID"));
		salesEntry.setSaleAmount(rs.getInt("SaleAmount"));
		return salesEntry;
	}


}
