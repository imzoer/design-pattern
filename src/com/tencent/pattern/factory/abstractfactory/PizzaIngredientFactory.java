package com.tencent.pattern.factory.abstractfactory;

import com.tencent.pattern.factory.abstractfactory.pizza.Cheese;
import com.tencent.pattern.factory.abstractfactory.pizza.Dough;
import com.tencent.pattern.factory.abstractfactory.pizza.OtherThings;
import com.tencent.pattern.factory.abstractfactory.pizza.Sauce;
import com.tencent.pattern.factory.abstractfactory.pizza.Veggie;

/**
 * Created by masonqwli on 16/1/18.
 */
public interface PizzaIngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggie[] createVeggies();
	OtherThings createOtherThings();
}
