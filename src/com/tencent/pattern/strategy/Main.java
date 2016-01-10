package com.tencent.pattern.strategy;

import com.tencent.pattern.strategy.ducks.Duck;
import com.tencent.pattern.strategy.ducks.RubberDuck;
import com.tencent.pattern.strategy.fly.FlyRocket;

/**
 * Created by masonqwli on 16/1/9.
 */
public class Main {
	public static void main(String[] args) {
		Duck duck = new RubberDuck();
		duck.performFly();
		duck.setFly(new FlyRocket());
		duck.performFly();
		duck.performQuack();
		duck.swim();
	}
}
