package com.tencent.pattern.decoration.condiment;

import com.tencent.pattern.decoration.coffee.Beverage;

/**
 * Created by masonqwli on 16/1/10.
 */
public class Mocha extends Condiment {
	public Mocha(Beverage coffee) {
		super(coffee);
	}

	@Override
	public String desp() {
		return coffee.desp() + "," + "mocha";
	}

	@Override
	public double cost() {
		return coffee.cost() + 0.6;
	}
}
