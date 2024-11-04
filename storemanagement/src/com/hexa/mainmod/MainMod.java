package com.hexa.mainmod;

import java.util.ArrayList;
import java.util.List;

import com.hexa.entity.Cart;
import com.hexa.entity.Product;
import com.hexa.entity.Store;
import com.hexa.service.StoreServiceImpl;

public class MainMod {

	public static void main(String[] args) {
		Product obj = new Product(100, "Pencil", "carbon pencil", 2, 5, "Stationary");
		Product obj1 = new Product(101, "Pen", "Ball pen", 12, 15, "Stationary");
		Product obj2 = new Product(102, "colour", "colour pen", 6, 7, "Stationary");
		Product obj3 = new Product(103, "Eraser", "erase", 5, 5, "Stationary");
		List<Product> stock = new ArrayList();
		stock.add(obj);
		stock.add(obj1);
		stock.add(obj2);
		stock.add(obj3);

		 Store myStore=new Store("V-Mart","Chennai",stock);
			System.out.println("Store  "+ myStore);
			List<Product> cartlist=new ArrayList();
			Cart myCart=new Cart(cartlist);
			StoreServiceImpl serviceObj=new StoreServiceImpl(myCart, myStore);
			serviceObj.addToCart(101, 18);
			serviceObj.addToCart(101, 18);
			System.out.println("Store  "+ myStore);
			System.out.println(myStore);
			serviceObj.removeFromCart(101, 10);
			serviceObj.removeFromCart(102, 11);
			System.out.println(myCart);
			System.out.println(myStore);
			
	}
}
