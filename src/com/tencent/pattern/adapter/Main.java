package com.tencent.pattern.adapter;

/**
 * Created by masonqwli on 16/1/17.
 */
public class Main {
	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		turkey.gobble();
		turkey.fly();

		Duck duck = new WildDuck();
		testDuck(duck);
		duck = new TurkeyAdapter(turkey);
		testDuck(duck);
	}

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
