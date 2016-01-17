package com.tencent.pattern.factory.simplefactory;

/**
 * Created by masonqwli on 16/1/17.
 */
public class PizzaFactory {
	public static Pizza createPizza(String type) {
		Pizza pizza;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else {
			throw new IllegalArgumentException("pizza type not found");
		}
		return pizza;
	}
}
