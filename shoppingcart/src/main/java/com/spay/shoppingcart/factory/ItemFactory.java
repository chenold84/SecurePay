package com.spay.shoppingcart.factory;

import com.spay.shoppingcart.entities.Item;

/**
 * Factory class to create the an Item. Can be improvised to retrieve objects from a cache.
 * @author chen
 *
 */
public class ItemFactory {

	public Item getItem() {
		return new Item();
	}

}
