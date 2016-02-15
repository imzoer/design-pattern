package com.tencent.pattern.State;

/**
 * Created by masonqwli on 16/2/15.
 */
public class GumballMachine {

	private NoQuarterState noQuarterState = new NoQuarterState(this);
	private HasQuarterState hasQuarterState = new HasQuarterState(this);
	private SoldState soldState = new SoldState(this);
	private SoldOutState soldOutState = new SoldOutState(this);
	private WinnerState winnerState = new WinnerState(this);
	private State state;
	private int ballCount;

	public GumballMachine(int count) {
		this.ballCount = count;
		this.state = noQuarterState;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void releaseBall() {
		ballCount--;
		System.err.println("released a ball!");
	}

	public int getCount() {
		return ballCount;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "machine:" + ballCount;
	}

	public NoQuarterState getNoQuarterState() {
		return noQuarterState;
	}

	public HasQuarterState getHasQuarterState() {
		return hasQuarterState;
	}

	public SoldState getSoldState() {
		return soldState;
	}

	public SoldOutState getSoldOutState() {
		return soldOutState;
	}

	public WinnerState getWinnerState() {
		return winnerState;
	}

	public State getState() {
		return state;
	}
}
