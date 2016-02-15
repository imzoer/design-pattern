package com.tencent.pattern.State;

/**
 * Created by masonqwli on 16/2/15.
 */
public class Main {
	public static void main(String[] args) {
		GumballMachine machine = new GumballMachine(5);
		System.err.println(machine);

		machine.insertQuarter();
		machine.turnCrank();

		System.err.println(machine);

		machine.insertQuarter();
		machine.turnCrank();
		machine.insertQuarter();
		machine.turnCrank();

		System.err.println(machine);
	}
}
