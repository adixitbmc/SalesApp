package com.test.amol.execcise.sales.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import com.amol.exercise.sales.model.Product;
import com.amol.exercise.sales.model.SalesEntry;
import com.amol.exercise.sales.service.DataService;

public class DaoTest {
	static DataService dataService = null;
	
	@BeforeClass
	public static void Init() throws Exception{
		dataService = Mockito.mock(DataService.class);
		
		SalesEntry dummySalesEntry = new SalesEntry(1, new Date(), 1,10, 100);
		when(dataService.getSalesEntryById(1)).thenReturn(dummySalesEntry);
		
		List<Product> dummyProduct = new ArrayList<Product>();
		dummyProduct.add(new Product(1, "Product1"));
		dummyProduct.add(new Product(2, "Product2"));
		when(dataService.getProductList()).thenReturn((List<Product>) dummyProduct);
	}
	
	@Test
	public void testGetSingleSalesEntry() throws Exception {
		SalesEntry salesEntry = dataService.getSalesEntryById(1);
		 assertEquals(1, salesEntry.getSalesId());
		 assertEquals(1, salesEntry.getProductID());
		 assertEquals(10, salesEntry.getItemsSold());
		 assertEquals(100, salesEntry.getSaleAmount());
	}
	
	@Test
	public void testGetProduct() throws Exception {
		  List<Product> productList = dataService.getProductList();
		  assertEquals(2, productList.size());
		  assertEquals("Product1", productList.get(0).getName());
		  assertEquals(2, productList.get(1).getId());
		  
		  
	}

}
