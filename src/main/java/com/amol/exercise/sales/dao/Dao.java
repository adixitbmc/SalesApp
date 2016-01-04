package com.amol.exercise.sales.dao;

import java.util.List;

import com.amol.exercise.sales.model.Product;
import com.amol.exercise.sales.model.SalesEntry;

public interface Dao {
	
	public boolean addProduct(Product employee) throws Exception;
	public Product getProductById(long id) throws Exception;
	public List<Product> getProductList() throws Exception;
	public boolean deleteProduct(long id) throws Exception;
	
	public boolean addSalesEntry(SalesEntry employee) throws Exception;
	public SalesEntry getSalesEntryById(long id) throws Exception;
	public List<SalesEntry> getSalesEntryList() throws Exception;
	public boolean deleteSalesEntry(long id) throws Exception;
	
	public List<SalesReportEntry> getSalesReport() throws Exception;
	
}
