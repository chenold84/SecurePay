package com.spay.shoppingcart.factory;

import java.util.ArrayList;

import com.spay.shoppingcart.entities.Category;
import com.spay.shoppingcart.entities.Item;

/**
 * Factory class to create a category. Can be improvised to retrieve objects from a cache.
 * @author chen
 *
 */
public class CategoryFactory {

	public Category getCategory() {
		Category newCategory = new Category();
		newCategory.setItems(new ArrayList <Item>());
		return newCategory;
	}

}
