package com.tencent.pattern.factory.abstractfactory.ny;

import com.tencent.pattern.factory.abstractfactory.PizzaIngredientFactory;
import com.tencent.pattern.factory.abstractfactory.PizzaStore;

/**
 * Created by masonqwli on 16/1/18.
 */
public class NYPizzaStore extends PizzaStore {
	public NYPizzaStore(PizzaIngredientFactory factory) {
		super(factory);
	}
}
