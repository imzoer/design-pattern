package com.tencent.pattern.factory.factorymethod;

import com.tencent.pattern.factory.simplefactory.Pizza;

/**
 * Created by masonqwli on 16/1/17.
 */
public class Main {
	public static void main(String[] args) {
		PizzaStore store = new ChicagoStylePizzaStore();
		Pizza pizza = store.orderPizza("cheese");
		System.err.println("pizza ok:" + pizza);
		pizza = store.orderPizza("clam");
		System.err.println("pizza ok:" + pizza);
	}
}
