package com.spay.shoppingcart.entities;

/**
 * Interface which defines a number datatype for this app
 * @author chen
 *
 */
public interface INumber {
	double getValue();
	int getPrecision();
	void setValue(double value);
}
