package com.spay.shoppingcart.entities;

import java.math.BigDecimal;

import com.spay.shoppingcart.constants.RatingConstant;

/**
 * Class represents a rating field. It stores the value and the precision.
 * The value is always rounded to the precision mentioned.
 * @author chen 
 */
public class Rating implements INumber {

	private BigDecimal value;
	private int precision;

	Rating(){
		this.precision = RatingConstant.PRECISION;
		this.value = (new BigDecimal(0.00)).setScale(this.precision, BigDecimal.ROUND_CEILING);
	}
	
	Rating(double value){
		this.precision = RatingConstant.PRECISION;
		this.value = (new BigDecimal(value)).setScale(this.precision, BigDecimal.ROUND_CEILING);
	}
	@Override
	public double getValue() {
		return value.doubleValue();
	}

	@Override
	public int getPrecision() {
		return precision;
	}
	
	public void setValue(double value) {
		this.value = (new BigDecimal(value)).setScale(this.precision, BigDecimal.ROUND_CEILING);
	}

}
