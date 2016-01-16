package com.tencent.pattern.command;

/**
 * Created by masonqwli on 16/1/16.
 */
public class Main {
	public static void main(String args[]) {
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.onPressed(0);
		remoteControl.undoPressed();
		remoteControl.offPressed(0);
	}
}
