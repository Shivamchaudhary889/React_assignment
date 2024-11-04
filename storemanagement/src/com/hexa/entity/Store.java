package com.hexa.entity;
import java.util.List;
// store has Products
public class Store {
	private String storeName;
	private String address;
    private List<Product> stockList;
	
    
	public Store() {
		super();
	}
	
	public Store(String storeName, String address, List<Product> stockList) {
		super();
		this.storeName = storeName;
		this.address = address;
		this.stockList =stockList;
	}
	
	
	
	
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Product> getStockList() {
		return stockList;
	}

	public void setStockList(List<Product> stocktList) {
		this.stockList = stocktList;
	}

	@Override
	public String toString() {
		return "Store [storeName=" + storeName + ", address=" + address + ", productList=" + stockList + "]";
	}
    
    
	
}
