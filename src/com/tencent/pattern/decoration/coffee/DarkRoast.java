package com.tencent.pattern.decoration.coffee;

/**
 * Created by masonqwli on 16/1/10.
 */
public class DarkRoast extends Beverage {

	@Override
	public String desp() {
		return "DarkRoast";
	}

	@Override
	public double cost() {
		return 2.0;
	}
}
