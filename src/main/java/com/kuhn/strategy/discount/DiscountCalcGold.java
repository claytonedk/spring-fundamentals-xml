package com.kuhn.strategy.discount;

public class DiscountCalcGold implements DiscountCalc {

	@Override
	public double calculateDiscount(double totalValue) {
		return totalValue * 0.10f;
	}

}
