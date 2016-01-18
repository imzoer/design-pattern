package com.tencent.pattern.factory.abstractfactory.ny;

import com.tencent.pattern.factory.abstractfactory.pizza.Cheese;
import com.tencent.pattern.factory.abstractfactory.pizza.Dough;
import com.tencent.pattern.factory.abstractfactory.pizza.OtherThings;
import com.tencent.pattern.factory.abstractfactory.PizzaIngredientFactory;
import com.tencent.pattern.factory.abstractfactory.pizza.Sauce;
import com.tencent.pattern.factory.abstractfactory.pizza.Veggie;

/**
 * Created by masonqwli on 16/1/18.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	@Override
	public Dough createDough() {
		System.err.println("NY create dough");
		return new NYDough();
	}

	@Override
	public Sauce createSauce() {
		System.err.println("NY create sauce");
		return new NYSauce();
	}

	@Override
	public Cheese createCheese() {
		System.err.println("NY create cheese");
		return new NYCheese();
	}

	@Override
	public Veggie[] createVeggies() {
		System.err.println("NY create veggies");
		return new Veggie[]{};
	}

	@Override
	public OtherThings createOtherThings() {
		return new OtherThings();
	}
}
