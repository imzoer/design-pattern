package com.tencent.pattern.decoration.condiment;

import com.tencent.pattern.decoration.coffee.Beverage;

/**
 * Created by masonqwli on 16/1/10.
 */
public abstract class Condiment extends Beverage {
	Beverage coffee;
	public Condiment(Beverage coffee){
		this.coffee = coffee;
	}
}
