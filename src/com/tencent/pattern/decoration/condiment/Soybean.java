package com.tencent.pattern.decoration.condiment;

import com.tencent.pattern.decoration.coffee.Beverage;

/**
 * Created by masonqwli on 16/1/10.
 */
public class Soybean extends Condiment {
	public Soybean(Beverage coffee) {
		super(coffee);
	}

	@Override
	public String desp() {
		return coffee.desp() + "," + "Soybean";
	}

	@Override
	public double cost() {
		return coffee.cost() + cal();
	}

	private double cal() {
		if (coffee.getSize() == Size.tall) {
			return 0.1;
		} else if (coffee.getSize() == Size.grande) {
			return 0.15;
		} else {
			return 0.2;
		}
	}
}
