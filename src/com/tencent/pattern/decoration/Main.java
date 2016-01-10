package com.tencent.pattern.decoration;

import com.tencent.pattern.decoration.coffee.Beverage;
import com.tencent.pattern.decoration.coffee.DarkRoast;
import com.tencent.pattern.decoration.coffee.HouseBlend;
import com.tencent.pattern.decoration.condiment.Milk;
import com.tencent.pattern.decoration.condiment.Mocha;
import com.tencent.pattern.decoration.condiment.Soybean;

/**
 * Created by masonqwli on 16/1/10.
 */
public class Main {
	public static void main(String[] args) {

		// test1
		Beverage coffee = new DarkRoast();
		coffee = new Milk(coffee);
		System.err.println("coffee price:" + coffee.desp() + ", " + coffee.cost());
		coffee = new Mocha(coffee);
		System.err.println("coffee price:" + coffee.desp() + ", " + coffee.cost());

		// test2
		Beverage coffee1 = new HouseBlend();
		coffee1 = new Milk(coffee1);
		System.err.println("coffee price:" + coffee1.desp() + ", " + coffee1.cost());

		// test3
		Beverage coffee2 = new HouseBlend();
		coffee2.setSize(Beverage.Size.venti);
		coffee2 = new Soybean(coffee2);
		System.err.println("coffee price:" + coffee2.desp() + ", " + coffee2.cost());
	}
}
