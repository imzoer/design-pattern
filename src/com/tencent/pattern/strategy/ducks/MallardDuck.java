package com.tencent.pattern.strategy.ducks;

import com.tencent.pattern.strategy.fly.FlyWithWings;
import com.tencent.pattern.strategy.quack.QuackGaGa;

/**
 * Created by masonqwli on 16/1/9.
 */
public class MallardDuck extends Duck {
	public MallardDuck() {
		fly = new FlyWithWings();
		quack = new QuackGaGa();
	}

	@Override
	void display() {
		System.err.println("i am mallard duck, handsome");
	}
}
