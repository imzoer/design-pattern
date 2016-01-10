package com.tencent.pattern.decoration.coffee;

/**
 * Created by masonqwli on 16/1/10.
 */
public abstract class Beverage {
	public abstract String desp();

	public abstract double cost();

	public static enum Size {
		tall, grande, venti
	}

	protected Size size;

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
}
