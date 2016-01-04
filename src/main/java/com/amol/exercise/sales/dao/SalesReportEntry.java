package com.amol.exercise.sales.dao;


public class SalesReportEntry {

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getTotalItemsSold() {
		return totalItemsSold;
	}
	public void setTotalItemsSold(int totalItemsSold) {
		this.totalItemsSold = totalItemsSold;
	}
	public int getTotalSaleAmount() {
		return totalSaleAmount;
	}
	public void setTotalSaleAmount(int totalSaleAmount) {
		this.totalSaleAmount = totalSaleAmount;
	}
	private String productName; 
	private int totalItemsSold;
	private int totalSaleAmount; 
}
