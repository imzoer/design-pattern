package com.tencent.pattern.strategy.ducks;

import com.tencent.pattern.strategy.fly.IFly;
import com.tencent.pattern.strategy.quack.IQuack;

/**
 * Created by masonqwli on 16/1/9.
 */
public abstract class Duck {

	abstract void display();

	protected IFly fly;
	protected IQuack quack;

	public void swim() {
		System.err.println("swimming");
	}

	public void performFly() {
		fly.fly();
	}

	public void performQuack() {
		quack.quack();
	}

	public IFly getFly() {
		return fly;
	}

	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public IQuack getQuack() {
		return quack;
	}

	public void setQuack(IQuack quack) {
		this.quack = quack;
	}
}
