package com.spay.shoppingcart.service;

import java.util.List;

import com.spay.shoppingcart.dao.CartDao;
import com.spay.shoppingcart.dao.CatelogueDao;
import com.spay.shoppingcart.entities.Category;
import com.spay.shoppingcart.entities.Item;
import com.spay.shoppingcart.factory.CartDaoFactory;
import com.spay.shoppingcart.factory.CatelogueDaoFactory;

/**
 * Mocks the service in MVC pattern. Does the operations during shopping exercise.
 * @author chen
 *
 */
public class ShoppingServiceImpl implements ShoppingService {
	private static ShoppingService instance = new ShoppingServiceImpl();
	private CartDao cartDao;
	private CatelogueDao catDao;
	
	//To make it singleton
	private ShoppingServiceImpl() {
		cartDao = CartDaoFactory.getInstance().createCartDao("default");
		catDao = CatelogueDaoFactory.getInstance().createCatelogueDao("default");
	}
	
	/**
	 * Returns the instance of the class
	 * @return
	 */
	public static ShoppingService getInstance() {
		return instance;
	}
	
	/**
	 * Adds an item to the shopping cart
	 */
	public void addToCart(Item item) {
		cartDao.addToCart(item);
	}
	
	/**
	 * Retrieves the items selected in a cart
	 */
	public List<Item> checkOut(){
		return cartDao.getCartItems();
	}

	/**
	 * Retrieves the list of categories and the items corresponding to it.
	 */
	public List<Category> fetchCatelogue(){
		return catDao.fetchCatelogue();
	}
}
