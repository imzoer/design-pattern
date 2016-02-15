package com.tencent.pattern.State;

/**
 * Created by masonqwli on 16/2/15.
 */
public interface State {
	void insertQuarter();

	void ejectQuarter();

	void turnCrank();

	void dispense();
}
