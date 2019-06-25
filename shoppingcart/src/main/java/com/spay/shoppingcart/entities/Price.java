package com.spay.shoppingcart.entities;

import java.math.BigDecimal;

import com.spay.shoppingcart.constants.PriceConstant;

/**
 * Class represents an amount field. It stores the value and the precision.
 * The value is always rounded to the precision mentioned.
 * @author chen 
 */
public class Price implements INumber {
	
	private BigDecimal value;
	private int precision;

	Price(){
		this.precision = PriceConstant.PRECISION;
		this.value = (new BigDecimal(0.00)).setScale(this.precision, BigDecimal.ROUND_CEILING);
	}
	
	Price(double value){
		this.precision = PriceConstant.PRECISION;
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
