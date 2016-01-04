package com.amol.exercise.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amol.exercise.sales.dao.SalesReportEntry;
import com.amol.exercise.sales.model.Product;
import com.amol.exercise.sales.model.SalesEntry;
import com.amol.exercise.sales.service.DataService;

@Controller
public class SalesController{

	@Autowired
	DataService dataService;
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public @ResponseBody
	List<Product> getProducts() {

		List<Product> ProductList = null;
		try {
			ProductList = dataService.getProductList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return ProductList;
	}
	
	@RequestMapping(value = "/sales-entries", method = RequestMethod.GET)
	public @ResponseBody
	List<SalesEntry> getSalesEntries() {

		List<SalesEntry> salesEntryList = null;
		try {
			salesEntryList = dataService.getSalesEntryList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return salesEntryList;
	}
	
	@RequestMapping(value = "/sales-entry/{salesId}", method = RequestMethod.GET)
	public @ResponseBody
	SalesEntry getSalesEntry(@PathVariable int salesId) {
		SalesEntry salesEntryById  = null;
		try {
			salesEntryById= dataService.getSalesEntryById(salesId);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return salesEntryById;
	}
	
	
	@RequestMapping(value = "/sales-report", method = RequestMethod.GET)
	public @ResponseBody
	List<SalesReportEntry> getSalesReport() {

		List<SalesReportEntry> salesEntryReport = null;
		try {
			salesEntryReport = dataService.getSalesReport();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return salesEntryReport;
	}
	
	

}


