package com.tencent.pattern.decoration.coffee;

/**
 * Created by masonqwli on 16/1/10.
 */
public class HouseBlend extends Beverage {

	@Override
	public String desp() {
		return "HouseBlend";
	}

	@Override
	public double cost() {
		return 1.0;
	}
}
