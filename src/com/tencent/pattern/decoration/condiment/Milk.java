package com.tencent.pattern.decoration.condiment;

import com.tencent.pattern.decoration.coffee.Beverage;

/**
 * Created by masonqwli on 16/1/10.
 */
public class Milk extends Condiment {
	public Milk(Beverage coffee) {
		super(coffee);
	}

	@Override
	public String desp() {
		return coffee.desp() + "," + "milk";
	}

	@Override
	public double cost() {
		return coffee.cost() + 0.5;
	}
}
