package com.spay.shoppingcart.entities;

/**
 * This class represent each product.
 * @author chen
 *
 */
public class Item {
	private String itemName;
	private String category;
	private Price costPrice;
	private Price shippingCharge;
	private Rating rating;

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setCostPrice(double costPrice) {
		this.costPrice = new Price(costPrice);
	}

	public void setShippingCharge(double shippingCharge) {
		this.shippingCharge = new Price(shippingCharge);
	}

	public void setRating(double rating) {
		this.rating = new Rating(rating);
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getItemName() {
		return itemName;
	}

	public String getCategory() {
		return category;
	}

	public double getShippingCharge() {
		return shippingCharge.getValue();
	}

	public double getCostPrice() {
		return costPrice.getValue();
	}

	public double getRating() {
		return rating.getValue();
	}

	public String toString() {
		return "ItemImpl [itemName=" + itemName + ", category=" + category + ", costPrice=" + costPrice.getValue()
				+ ", shippingCharge=" + shippingCharge.getValue() + ", rating=" + rating.getValue() + "]";
	}

}