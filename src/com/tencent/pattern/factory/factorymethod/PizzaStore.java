package com.tencent.pattern.factory.factorymethod;

import com.tencent.pattern.factory.simplefactory.Pizza;

/**
 * Created by masonqwli on 16/1/17.
 */
public abstract class PizzaStore {
	abstract Pizza createPizza(String type);

	public final Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bask();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
