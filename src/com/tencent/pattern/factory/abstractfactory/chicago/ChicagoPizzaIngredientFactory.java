package com.tencent.pattern.factory.abstractfactory.chicago;

import com.tencent.pattern.factory.abstractfactory.pizza.Cheese;
import com.tencent.pattern.factory.abstractfactory.pizza.Dough;
import com.tencent.pattern.factory.abstractfactory.pizza.OtherThings;
import com.tencent.pattern.factory.abstractfactory.PizzaIngredientFactory;
import com.tencent.pattern.factory.abstractfactory.pizza.Sauce;
import com.tencent.pattern.factory.abstractfactory.pizza.Veggie;

/**
 * Created by masonqwli on 16/1/18.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	@Override
	public Dough createDough() {
		System.err.println("chicago create dough");
		return new ChicagoDough();
	}

	@Override
	public Sauce createSauce() {
		System.err.println("chicago create sauce");
		return new ChicagoSauce();
	}

	@Override
	public Cheese createCheese() {
		System.err.println("chicago create cheese");
		return new ChicagoCheese();
	}

	@Override
	public Veggie[] createVeggies() {
		System.err.println("chicago create veggies");
		return new Veggie[]{};
	}

	@Override
	public OtherThings createOtherThings() {
		System.err.println("chicago create other things");
		return new OtherThings();
	}
}
