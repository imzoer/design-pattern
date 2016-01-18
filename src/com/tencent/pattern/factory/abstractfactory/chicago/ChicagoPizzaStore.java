package com.tencent.pattern.factory.abstractfactory.chicago;

import com.tencent.pattern.factory.abstractfactory.PizzaIngredientFactory;
import com.tencent.pattern.factory.abstractfactory.PizzaStore;

/**
 * Created by masonqwli on 16/1/18.
 */
public class ChicagoPizzaStore extends PizzaStore {
	public ChicagoPizzaStore(PizzaIngredientFactory factory) {
		super(factory);
	}
}
