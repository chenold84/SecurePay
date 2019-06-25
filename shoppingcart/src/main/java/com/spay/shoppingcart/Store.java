package com.spay.shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.spay.shoppingcart.constants.AppConstants;
import com.spay.shoppingcart.entities.Category;
import com.spay.shoppingcart.entities.Item;
import com.spay.shoppingcart.factory.CategoryFactory;
import com.spay.shoppingcart.factory.ItemFactory;

/**
 * The class mocks a database where data is stored.
 * @author chen
 *
 */
public class Store {
	
	//Catelogue stores the list of categories and the items corresponding to each category.
	private static List<Category> catelogue = new ArrayList<>();
	
	//Mocks a shopping cart where the app adds selected items to it.
	private static List<Item> cart = new ArrayList<>();
	
	/**
	 * 
	 * Loads the generates categories and items. Price, Shipping cost and 
	 * Rating for each item is randomly generated.
	 */
	public static void loadCatelogue() {
		CategoryFactory categoryFactory = new CategoryFactory();
		ItemFactory itemFactory = new ItemFactory();
		Category currentCategory;
		Item currentItem;
		List <Item> items ;
		System.out.println("Loading the values..");
		for(int i = 1; i <= AppConstants.MAX_CATEGORIES; i++) {
			currentCategory = categoryFactory.getCategory();
			currentCategory.setCategoryName("Category"+i);
			
			Random costRand = new Random();
			Random shippingRand = new Random();
			Random ratingRand = new Random();
			
			items = new ArrayList<Item>();
			for(int j = 1; j <= AppConstants.MAX_ITEMS; j++) {
				currentItem = itemFactory.getItem();
				currentItem.setItemName("Item "+j);
				
				//Price to be from 1 to 20
				currentItem.setCostPrice(1 + (costRand.nextDouble() * 19));
				
				//Shipping charge to be from 2 to 5
				currentItem.setShippingCharge(2 + (shippingRand.nextDouble() * 3));
				
				//Rating to be from 1 to 5
				currentItem.setRating(1 + (ratingRand.nextDouble() * 4));
				currentItem.setCategory(currentCategory.getCategoryName());
				items.add(currentItem);
				//System.out.println(currentItem);
			}
			currentCategory.setItems(items);
			catelogue.add(currentCategory);
		}
		System.out.println("Loading complete!!");
	}

	/**
	 * Method to retrieve the cart from the memory.
	 * @return The cart stored in memory.
	 */
	public static List<Item> retrieveCart() {
		return cart;
	}

	/**
	 * Method to add a single item to the cart list.
	 * @param item - Selected item
	 */
	public static void addToCart(Item item) {
		cart.add(item);
	}

	/**
	 * Method to return the catelogue from memory.
	 * @return Catelogue - List of categories and the list of items.
	 */
	public static List<Category> retrieveCatelogue() {
		return catelogue;
	}
}