package com.tencent.pattern.State;

import java.util.Random;

/**
 * Created by masonqwli on 16/2/15.
 */
public class HasQuarterState implements State {

	private GumballMachine machine;

	public HasQuarterState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.err.println("already inserted a quarter");
	}

	@Override
	public void ejectQuarter() {
		System.err.println("quarter returned");
	}

	@Override
	public void turnCrank() {
		System.err.println("turned");
		int winner = new Random().nextInt(10);
		if (winner == 0 && machine.getCount() > 1) {
			machine.setState(machine.getWinnerState());
		} else {
			machine.setState(machine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.err.println("turn crank first");
	}
}
