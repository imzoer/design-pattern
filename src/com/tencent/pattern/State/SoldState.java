package com.tencent.pattern.State;

/**
 * Created by masonqwli on 16/2/15.
 */
public class SoldState implements State {
	private GumballMachine machine;

	public SoldState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.err.println("giving a ball, wait...");
	}

	@Override
	public void ejectQuarter() {
		System.err.println("already turned the crank, no return");
	}

	@Override
	public void turnCrank() {
		System.err.println("already turned the crank");
	}

	@Override
	public void dispense() {
		machine.releaseBall();
		if (machine.getCount() == 0) {
			machine.setState(machine.getSoldOutState());
		} else {
			machine.setState(machine.getNoQuarterState());
		}
	}
}
