package com.tencent.pattern.command;

/**
 * Created by masonqwli on 16/1/16.
 */
public interface Command {
	void execute();
	void undo();
}
