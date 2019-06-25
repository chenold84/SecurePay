package com.spay.shoppingcart;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.spay.shoppingcart.controller.ShoppingController;
import com.spay.shoppingcart.entities.Item;

public class ViewTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Store.loadCatelogue();
	}

	@Test
	public void testDoShopping() {
		View.doShopping();
		Iterator <Item>items = ShoppingController.getInstance().checkOut().iterator();
		double totalCost = 0.0;
		while(items.hasNext()) {
			Item item = items.next();
			totalCost += (item.getCostPrice()+item.getShippingCharge());
		}
		assertTrue("Total cost should be greater than 0 and lesser than or equal to 50.", ((totalCost > 0) && totalCost <= 50));
	}

}
