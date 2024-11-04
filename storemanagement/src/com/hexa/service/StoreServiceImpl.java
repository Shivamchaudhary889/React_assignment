package com.hexa.service;

import com.hexa.entity.Cart;
import com.hexa.entity.Product;
import com.hexa.entity.Store;

public class StoreServiceImpl implements IStoreService {

	private Cart myCart;
	private Store myStore;

	public StoreServiceImpl(Cart myCart, Store myStore) {
		super();
		this.myCart = myCart;
		this.myStore = myStore;
	}

	public boolean addToCart(int productId, int quantity) {
		boolean status = true;
		for (Product t : this.myStore.getStockList()) {
			if (t.getProductId() == productId) {
				if (t.getQuantity() < quantity) {
					System.out.println("Insufficient quantity");
				} else {
					Product cartProduct = new Product(t.getProductId(), t.getProductName(), t.getDescription(),
							t.getPrice(), t.getCategory());
					cartProduct.setQuantity(quantity);

					this.myCart.getCartList().add(cartProduct);

					myCart.getCartList().add(t);

					t.setQuantity(t.getQuantity() - quantity);
					status = true;
				}
				break;
			}
		}
		if (status == false) {
			System.out.println("Stock not present");
		}
		return status;
	}

	public boolean reoveToCart(int productId, int quantity) {

		return false;
	}

	public void proceedToCheckout() {

	}
	
	
	

	@Override
	public boolean removeFromCart(int productId, int quantity) {
		// TODO Auto-generated method stub
		boolean status = false;
		//for iterating cart
		
		Product required=null;
		for (Product cartProduct : this.myCart.getCartList()) {
			if (cartProduct.getProductId() == productId) {
				if (quantity == cartProduct.getQuantity()) {
					required=cartProduct;
					break;
					//this.myCart.getCartList().remove(cartProduct);
				} 
				else if (quantity < cartProduct.getQuantity()) {
					cartProduct.setQuantity(cartProduct.getQuantity() - quantity);
				}
				status=true;
			}}
		//iteyrating the stocks and increasing the quantity
		if(required!=null) {
		this.myCart.getCartList().remove(required);
		
		for (Product t : this.myStore.getStockList()) {
			if (t.getProductId() == productId) {
				t.setQuantity(t.getQuantity()+quantity);
			              }
		return status;
	                }
		           }
		return status;
	}}

