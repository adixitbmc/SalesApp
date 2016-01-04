package com.amol.exercise.sales.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class SalesReportMapper implements RowMapper<SalesReportEntry> {

	public SalesReportEntry mapRow(ResultSet rs, int arg1)
			throws SQLException {
		SalesReportEntry salesReportEntry = new SalesReportEntry();
		salesReportEntry.setProductName(rs.getString("ProductName"));
		salesReportEntry.setTotalItemsSold(rs.getInt("Total # sold"));
		salesReportEntry.setTotalSaleAmount(rs.getInt("Total amount"));
		return salesReportEntry;
	}

}
