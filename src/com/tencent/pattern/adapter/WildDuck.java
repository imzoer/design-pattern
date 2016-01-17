package com.tencent.pattern.adapter;

/**
 * Created by masonqwli on 16/1/17.
 */
public class WildDuck implements Duck{
	@Override
	public void quack() {
		System.err.println("wild duck quack");
	}

	@Override
	public void fly() {
		System.err.println("wild duck fly long distance");
	}
}
