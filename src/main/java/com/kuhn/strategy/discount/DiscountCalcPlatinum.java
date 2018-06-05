package com.kuhn.strategy.discount;

public class DiscountCalcPlatinum implements DiscountCalc {

	@Override
	public double calculateDiscount(double totalValue) {
		return totalValue * 0.2f;
	}

}
