package com.spay.shoppingcart.service;

import java.util.List;

import com.spay.shoppingcart.entities.Category;
import com.spay.shoppingcart.entities.Item;

public interface ShoppingService {

	void addToCart(Item item);

	List<Item> checkOut();

	List<Category> fetchCatelogue();

}