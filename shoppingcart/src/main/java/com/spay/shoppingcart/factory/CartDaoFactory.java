package com.spay.shoppingcart.factory;

import com.spay.shoppingcart.dao.CartDao;
import com.spay.shoppingcart.dao.CartDaoImpl;

/**
 * The factory class to create the Shopping Cart DAO.
 * @author chen
 *
 */
public class CartDaoFactory {
	
	private static CartDaoFactory instance = new CartDaoFactory();
	
	private CartDaoFactory() {}
	
	public CartDao createCartDao(String key) {
		return new CartDaoImpl();
	}
	
	public static CartDaoFactory getInstance() {
		return instance;
	}

}
