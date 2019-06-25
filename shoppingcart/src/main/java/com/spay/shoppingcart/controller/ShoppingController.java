package com.spay.shoppingcart.controller;

import java.util.List;

import com.spay.shoppingcart.entities.Category;
import com.spay.shoppingcart.entities.Item;
import com.spay.shoppingcart.service.ShoppingServiceImpl;

/**
 * Mocks the controller in MVC pattern. Performs actions during shopping exercise
 * @author chen
 *
 */
public class ShoppingController {
	private static ShoppingController instance = new ShoppingController();
	//To make it singleton
	private ShoppingController() {}
	
	public static ShoppingController getInstance() {
		return instance;
	}

	/**
	 * Adds a selected item to the shopping cart
	 * @param item
	 */
	public void addToCart(Item item) {
		ShoppingServiceImpl.getInstance().addToCart(item);
	}
	
	/**
	 * Retrieves the list of items added to the shoping cart.
	 * @return
	 */
	public List<Item> checkOut(){
		return ShoppingServiceImpl.getInstance().checkOut();
	}
	
	/**
	 * Retrieves the list of categories and the items corresponding to it.
	 * @return
	 */
	public List<Category> fetchCatelogue(){
		return ShoppingServiceImpl.getInstance().fetchCatelogue();
	}
}
