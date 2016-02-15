package com.tencent.pattern.State;

/**
 * Created by masonqwli on 16/2/15.
 */
public class SoldOutState implements State {
	private GumballMachine machine;

	public SoldOutState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.err.println("sold out! can not insert quarter");
	}

	@Override
	public void ejectQuarter() {
		System.err.println("no quarter to return");
	}

	@Override
	public void turnCrank() {
		System.err.println("turned but balls sold out");
	}

	@Override
	public void dispense() {
		System.err.println("no balls to dispense");
	}
}
