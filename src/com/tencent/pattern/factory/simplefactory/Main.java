package com.tencent.pattern.factory.simplefactory;

/**
 * Created by masonqwli on 16/1/17.
 */
public class Main {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore();
		Pizza pizza = pizzaStore.orderPizza("clam");
		System.err.println("pizza ok:" + pizza);
	}
}
