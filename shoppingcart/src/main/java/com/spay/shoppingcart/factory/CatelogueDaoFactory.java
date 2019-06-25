package com.spay.shoppingcart.factory;

import com.spay.shoppingcart.dao.CatelogueDao;
import com.spay.shoppingcart.dao.CatelogueDaoImpl;

/**
 * Factory class to create the DAO to perform operations on catelogue
 * @author chen
 *
 */
public class CatelogueDaoFactory {
	private static CatelogueDaoFactory instance = new CatelogueDaoFactory();
	
	private CatelogueDaoFactory() {}
	
	public CatelogueDao createCatelogueDao(String key) {
		return new CatelogueDaoImpl();
	}
	
	public static CatelogueDaoFactory getInstance() {
		return instance;
	}

}
