package com.amol.exercise.sales.model;

import java.util.Date;

public class SalesEntry {
	public SalesEntry() {
		super();
	}
	public SalesEntry(int salesId, Date dateofSale, int productID,
			int itemsSold, int saleAmount) {
		super();
		SalesId = salesId;
		DateofSale = dateofSale;
		ProductID = productID;
		ItemsSold = itemsSold;
		SaleAmount = saleAmount;
	}
	public int getSalesId() {
		return SalesId;
	}
	public void setSalesId(int salesId) {
		SalesId = salesId;
	}
	public Date getDateofSale() {
		return DateofSale;
	}
	public void setDateofSale(Date dateofSale) {
		DateofSale = dateofSale;
	}
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public int getItemsSold() {
		return ItemsSold;
	}
	public void setItemsSold(int itemsSold) {
		ItemsSold = itemsSold;
	}
	public int getSaleAmount() {
		return SaleAmount;
	}
	public void setSaleAmount(int saleAmount) {
		SaleAmount = saleAmount;
	}
	private int SalesId; 
	private Date DateofSale; 
	private int ProductID; 
	private int ItemsSold;
	private int SaleAmount; 


}
