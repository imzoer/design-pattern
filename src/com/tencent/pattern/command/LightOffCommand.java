package com.tencent.pattern.command;

/**
 * Created by masonqwli on 16/1/16.
 */
public class LightOffCommand implements Command {
	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.off();
	}
}
