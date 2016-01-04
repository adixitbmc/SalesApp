package com.amol.exercise.sales.service;

import java.util.List;

import com.amol.exercise.sales.dao.SalesReportEntry;
import com.amol.exercise.sales.model.Product;
import com.amol.exercise.sales.model.SalesEntry;

public interface DataService {
	public List<Product> getProductList() throws Exception;
	public List<SalesEntry> getSalesEntryList() throws Exception;
	public List<SalesReportEntry> getSalesReport() throws Exception;
	public SalesEntry getSalesEntryById(long salesId) throws Exception;
	
	
}
