package com.spay.shoppingcart;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.spay.shoppingcart.constants.AppConstants;
import com.spay.shoppingcart.constants.PriceConstant;
import com.spay.shoppingcart.constants.RatingConstant;
import com.spay.shoppingcart.controller.ShoppingController;
import com.spay.shoppingcart.entities.Category;
import com.spay.shoppingcart.entities.Item;

public class View {

	public static void doShopping() {
		double totalCost = 0.00;
		Random categoryRand = new Random();
		Random itemRand = new Random();
		List <Category> myCatelogue = ShoppingController.getInstance().fetchCatelogue();
		
		while(true) {
			Item selectedItem = myCatelogue.get(categoryRand.nextInt(AppConstants.MAX_CATEGORIES)).
					getItems().get(itemRand.nextInt(AppConstants.MAX_ITEMS));
			
			totalCost += (selectedItem.getCostPrice()+selectedItem.getShippingCharge());
			if(totalCost > 50.00)
				break;
			ShoppingController.getInstance().addToCart(selectedItem);
		}
	}

	public static void checkOut() {
		Iterator <Item> itr = ShoppingController.getInstance().checkOut().iterator();
		
		System.out.println("Check out in progress!!");
		double totalCost = 0.00;
		double totalRating = 0.0;
		while(itr.hasNext()) {
			Item checkedOut = itr.next();
			System.out.println(checkedOut.getCategory()+":"+checkedOut.getItemName());
			totalCost += (checkedOut.getCostPrice()+ checkedOut.getShippingCharge());
			totalRating += checkedOut.getRating();
		}
		System.out.println("Total: "+Math.scalb(totalCost, PriceConstant.PRECISION));
		System.out.println("Rating: "+Math.scalb(totalRating, RatingConstant.PRECISION));
	}

}
