package com.tencent.pattern.factory.abstractfactory;

import com.tencent.pattern.factory.abstractfactory.pizza.CheesePizza;
import com.tencent.pattern.factory.abstractfactory.pizza.ClamPizza;
import com.tencent.pattern.factory.abstractfactory.pizza.Pizza;

/**
 * Created by masonqwli on 16/1/17.
 */
public abstract class PizzaStore {
	PizzaIngredientFactory factory;

	public PizzaStore(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	public final Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new CheesePizza();
		} else if (type.equals("clam")) {
			return new ClamPizza();
		}
		return null;
	}

	public final Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		assert pizza != null;
		pizza.prepare(factory);
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
