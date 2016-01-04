package com.amol.exercise.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.amol.exercise.sales.dao.Dao;
import com.amol.exercise.sales.dao.SalesReportEntry;
import com.amol.exercise.sales.model.Product;
import com.amol.exercise.sales.model.SalesEntry;

public class DataServiceImpl implements DataService {

	@Autowired
	Dao Dao;
	public Dao getDao() {
		return Dao;
	}

	public void setDao(Dao Dao) {
		this.Dao = Dao;
	}

	public List<Product> getProductList() throws Exception {
		return Dao.getProductList();
	}

	public List<SalesEntry> getSalesEntryList() throws Exception {
		return Dao.getSalesEntryList();
	}

	public List<SalesReportEntry> getSalesReport() throws Exception {
		return Dao.getSalesReport();
	}

	public SalesEntry getSalesEntryById(long salesId) throws Exception {
		return Dao.getSalesEntryById(salesId);
	}

	
}
