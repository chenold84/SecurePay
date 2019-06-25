package com.spay.shoppingcart.entities;

import java.util.List;

/**
 * Class which represents a category
 * @author chen
 *
 */
public class Category {
	//Name for the category
	private String categoryName;
	
	//List of items under it
	private List<Item> items;
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
