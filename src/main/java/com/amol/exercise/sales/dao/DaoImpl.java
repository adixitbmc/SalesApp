package com.amol.exercise.sales.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.amol.exercise.sales.model.Product;
import com.amol.exercise.sales.model.SalesEntry;

public class DaoImpl implements Dao {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean addProduct(Product employee) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	public Product getProductById(long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Product> getProductList() throws Exception {
		String SQL = "select * from producttable";
	      List <Product> products = this.getJdbcTemplate().query(SQL, 
	                                new ProductMapper());
		return products;
	}
	public boolean deleteProduct(long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean addSalesEntry(SalesEntry salesEntry) throws Exception {
		// TODO Auto-generated method stub
				return false;
	}
	public SalesEntry getSalesEntryById(long id) throws Exception {
		String SQL = "select * from salesentry where salesid = " + id;
	      SalesEntry salesEntry = this.getJdbcTemplate().queryForObject(SQL, 
	                                new SalesEntryMapper());
		return salesEntry;
	}
	
	
	public List<SalesEntry> getSalesEntryList() throws Exception {
		String SQL = "select * from salesentry";
	      List <SalesEntry> salesEntry = this.getJdbcTemplate().query(SQL, 
	                                new SalesEntryMapper());
		return salesEntry;
	}
	public boolean deleteSalesEntry(long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	public List<SalesReportEntry> getSalesReport() throws Exception {
		String SQL = "SELECT b.ProductName, SUM(a.ItemsSold) as 'Total # sold', SUM(a.SaleAmount) as 'Total Amount' from SalesEntry a, ProductTable b WHERE a.ProductID = b.ProductID GROUP BY a.ProductID";
	      List <SalesReportEntry> salesReportEntryList = this.getJdbcTemplate().query(SQL, 
	                                new SalesReportMapper());
		return salesReportEntryList ;
	}
	
	
	
	
}
