package com.spay.shoppingcart;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.spay.shoppingcart.constants.AppConstants;
import com.spay.shoppingcart.entities.Category;


public class StoreTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Store.loadCatelogue();
	}
	
	@Test
	public void testLoadCatelogue_noOfCategories() {
		List <Category> testCatelogue = Store.retrieveCatelogue();
		assertTrue("The maximum number of categories have not been generated!", testCatelogue.size() == AppConstants.MAX_CATEGORIES);
	}
	
	@Test
	public void testLoadCatelogue_noOfItems() {
		Iterator <Category> itr = Store.retrieveCatelogue().iterator();
		
		while(itr.hasNext()) {
			assertTrue("Insufficient items in category!", (itr.next().getItems().size() == AppConstants.MAX_ITEMS));
		}
	}
}
