package com.hexa.service;

public interface IStoreService {
    boolean removeFromCart(int productId,int quantity);
    boolean addToCart(int productId,int quantity);
	void proceedToCheckout();
	
}
