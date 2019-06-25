package com.spay.shoppingcart.dao;

import java.util.List;

import com.spay.shoppingcart.entities.Item;

public interface CartDao {

	List<Item> getCartItems();

	void addToCart(Item item);

}