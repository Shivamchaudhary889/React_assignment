package com.hexa.entity;
import java.util.List;

public class Cart {
	private List<Product> cartList;

	
	public Cart() {
		super();
	}

	public Cart(List<Product> cartList) {
		super();
		this.cartList = cartList;
	}

	public List<Product> getCartList() {
		return cartList;
	}

	public void setCartList(List<Product> cartList) {
		this.cartList = cartList;
	}

	@Override
	public String toString() {
		return "Cart [cartList=" + cartList + "]";
	}

	
}
