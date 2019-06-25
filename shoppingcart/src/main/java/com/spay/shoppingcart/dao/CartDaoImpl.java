package com.spay.shoppingcart.dao;

import java.util.List;

import com.spay.shoppingcart.Store;
import com.spay.shoppingcart.entities.Item;

/**
 * DAO to do operations on the shopping cart
 * @author chen
 *
 */
public class CartDaoImpl implements CartDao {
	
	/**
	 * Returns the list of items added to the shopping cart.
	 */
	public List<Item> getCartItems(){
		return Store.retrieveCart();
	}
	
	/**
	 * Adds a selected item to shopping cart.
	 */
	public void addToCart(Item item) {
		Store.addToCart(item);
	}

}
