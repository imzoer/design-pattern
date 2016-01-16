package com.tencent.pattern.command;

/**
 * Created by masonqwli on 16/1/16.
 */
public class RemoteControl {
	private Command[] onCommands;
	private Command[] offCommands;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		NoCommand noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}

		onCommands[0] = new LightOnCommand(new Light("客厅灯"));
		offCommands[0] = new LightOffCommand(new Light("客厅灯"));
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onPressed(int slot) {
		onCommands[slot].execute();
	}

	public void offPressed(int slot) {
		offCommands[slot].execute();
	}
}
