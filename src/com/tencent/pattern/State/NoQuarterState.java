package com.tencent.pattern.State;

/**
 * Created by masonqwli on 16/2/15.
 */
public class NoQuarterState implements State {
	private GumballMachine machine;

	public NoQuarterState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.err.println("inserted a quarter");
		machine.setState(machine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.err.println("no inserted quarter");
	}

	@Override
	public void turnCrank() {
		System.err.println("turned but no quarter");
	}

	@Override
	public void dispense() {
		System.err.println("pay first");
	}
}
