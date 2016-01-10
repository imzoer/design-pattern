package com.tencent.pattern.decoration;

/**
 * Created by masonqwli on 16/1/10.
 */
public class Beverage {
	private String desp;

	private int milk;
	private int mocha;

	public double cost() {
		return 1.0;
	}

	public String getDesp() {
		return desp;
	}

	public void setDesp(String desp) {
		this.desp = desp;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public int getMocha() {
		return mocha;
	}

	public void setMocha(int mocha) {
		this.mocha = mocha;
	}
}
