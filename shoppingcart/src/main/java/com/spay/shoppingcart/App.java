package com.spay.shoppingcart;

/**
 * App main class. App tries to mock MVC pattern for a shopping exercise.
 * Loads data to memory, retrieves the list of items, selects items and adds it to 
 * a shopping cart and then does a check out.
 * @author chen
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Load data is called to generate the Categories and Items to memory.
        loadData();
        
        //Add items to cart randomly
        shopItems();
        
        //Fetch the cart and display the items on console
        checkOut();
    }

	private static void checkOut() {
		View.checkOut();
	}

	private static void shopItems() {
		View.doShopping();
	}

	private static void loadData() {
		Store.loadCatelogue();
	}
}
