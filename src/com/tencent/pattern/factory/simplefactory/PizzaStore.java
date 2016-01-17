package com.tencent.pattern.factory.simplefactory;

/**
 * Created by masonqwli on 16/1/17.
 */
public class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza = PizzaFactory.createPizza(type);
		pizza.prepare();
		pizza.bask();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
