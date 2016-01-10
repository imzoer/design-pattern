package com.tencent.pattern.strategy.ducks;

import com.tencent.pattern.strategy.fly.FlyNoWay;
import com.tencent.pattern.strategy.quack.QuackZhiZhi;

/**
 * Created by masonqwli on 16/1/9.
 */
public class RubberDuck extends Duck {
	public RubberDuck() {
		fly = new FlyNoWay();
		quack = new QuackZhiZhi();
	}

	@Override
	void display() {
		System.err.println("i am rubber duck, beautiful");
	}
}
