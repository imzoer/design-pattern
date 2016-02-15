package com.tencent.pattern.State;

/**
 * Created by masonqwli on 16/2/15.
 */
public class WinnerState implements State {
	private GumballMachine machine;

	public WinnerState(GumballMachine machine) {
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
		System.err.println("should not turn");
	}

	@Override
	public void dispense() {
		System.err.println("YOU ARE WINNER, GET ONE MORE BALL");
		machine.releaseBall();
		if (machine.getCount() == 0) {
			machine.setState(machine.getSoldOutState());
		} else {
			machine.releaseBall();
			if (machine.getCount() == 0) {
				System.err.println("no balls left");
				machine.setState(machine.getSoldOutState());
			} else {
				machine.setState(machine.getNoQuarterState());
			}
		}
	}
}
