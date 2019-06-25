package com.spay.shoppingcart.dao;

import java.util.List;

import com.spay.shoppingcart.Store;
import com.spay.shoppingcart.entities.Category;

/**
 * DAO to perform operations on the catelogue.
 * @author chen
 *
 */
public class CatelogueDaoImpl implements CatelogueDao {
	
	/**
	 * Returns the catelogue list
	 */
	public List <Category> fetchCatelogue(){
		return Store.retrieveCatelogue();
	}
}
