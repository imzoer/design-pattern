package com.tencent.pattern.strategy.fly;

/**
 * Created by masonqwli on 16/1/9.
 */
public class FlyWithWings implements IFly {
	@Override
	public void fly() {
		System.err.println("flying with wings");
	}
}
