package com.tencent.pattern.adapter;

/**
 * Created by masonqwli on 16/1/17.
 */
public class WildTurkey implements Turkey {
	@Override
	public void gobble() {
		System.err.println("wild turkey gobble");
	}

	@Override
	public void fly() {
		System.err.println("wild turkey fly short distance");
	}
}
