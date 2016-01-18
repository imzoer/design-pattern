package com.tencent.pattern.factory.abstractfactory;

import com.tencent.pattern.factory.abstractfactory.chicago.ChicagoPizzaIngredientFactory;
import com.tencent.pattern.factory.abstractfactory.chicago.ChicagoPizzaStore;
import com.tencent.pattern.factory.abstractfactory.ny.NYPizzaIngredientFactory;
import com.tencent.pattern.factory.abstractfactory.ny.NYPizzaStore;
import com.tencent.pattern.factory.abstractfactory.pizza.Pizza;

/**
 * Created by masonqwli on 16/1/17.
 */
public class Main {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore(new NYPizzaIngredientFactory());
		Pizza pizza = nyStore.orderPizza("cheese");
		System.err.println("pizza ok:" + pizza);

		PizzaStore chicagoStore = new ChicagoPizzaStore(new ChicagoPizzaIngredientFactory());
		pizza = chicagoStore.orderPizza("clam");
		System.err.println("pizza ok:" + pizza);
	}
}
