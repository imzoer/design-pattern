package com.tencent.pattern.factory.factorymethod;

import com.tencent.pattern.factory.simplefactory.Pizza;

/**
 * Created by masonqwli on 16/1/17.
 */
public class NYStylePizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("clam")) {
			return new NYClamPizza();
		} else {
			throw new IllegalArgumentException("pizza type not found");
		}
	}
}
