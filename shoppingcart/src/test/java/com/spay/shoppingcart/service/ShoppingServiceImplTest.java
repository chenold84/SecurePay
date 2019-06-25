package com.spay.shoppingcart.service;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.spay.shoppingcart.Store;
import com.spay.shoppingcart.controller.ShoppingController;
import com.spay.shoppingcart.entities.Category;
import com.spay.shoppingcart.entities.Item;

public class ShoppingServiceImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Store.loadCatelogue();
	}

	@Test
	public void testFetchCatelogue() {
		assertTrue("Catelogue loading failed", ShoppingController.getInstance().fetchCatelogue().size() > 0);
	}
	
	@Test
	public void testAddToCart() {
		Item item = ShoppingController.getInstance().fetchCatelogue().get(1).getItems().get(1);
		int prevCount = Store.retrieveCart().size();
		ShoppingController.getInstance().addToCart(item);
		int currCount = Store.retrieveCart().size();
		assertTrue("Add to cart operation failed!", currCount > prevCount);
	}

	@Test
	public void testCheckOut() {
		Iterator <Category> catelogue = ShoppingController.getInstance().fetchCatelogue().iterator();
		if(catelogue.hasNext()) {
			List<Item> items = catelogue.next().getItems();
			for(int i=0; i < 5; i++) {
				ShoppingController.getInstance().addToCart(items.get(i));
			}
		}
		assertTrue("The number of items in the cart is not 5!", ShoppingController.getInstance().checkOut().size() == 5);
	}
}
