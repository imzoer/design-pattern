package com.tencent.pattern.factory.abstractfactory.pizza;

import com.tencent.pattern.factory.abstractfactory.PizzaIngredientFactory;

/**
 * Created by masonqwli on 16/1/18.
 */
public abstract class Pizza {
	Sauce sauce;
	Dough dough;
	Veggie[] veggies;
	Cheese cheese;
	OtherThings otherThings;

	public final void prepare(PizzaIngredientFactory factory) {
		cheese = factory.createCheese();
		dough = factory.createDough();
		sauce = factory.createSauce();
		otherThings = factory.createOtherThings();
		veggies = factory.createVeggies();
	}

	public void bake() {
	}

	public void cut() {
	}

	public void box() {
	}
}
