package com.tencent.pattern.factory.factorymethod;

import com.tencent.pattern.factory.simplefactory.Pizza;

/**
 * Created by masonqwli on 16/1/17.
 */
class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(java.lang.String type) {
		if (type.equals("cheese")) {
			return new ChicagoCheesePizza();
		} else if (type.equals("clam")) {
			return new ChicagoClamPizza();
		} else {
			throw new IllegalArgumentException("pizza type not found");
		}
	}
}
