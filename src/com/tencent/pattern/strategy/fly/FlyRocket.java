package com.tencent.pattern.strategy.fly;

/**
 * Created by masonqwli on 16/1/9.
 */
public class FlyRocket implements IFly {
	@Override
	public void fly() {
		System.err.println("flying like rocket");
	}
}
