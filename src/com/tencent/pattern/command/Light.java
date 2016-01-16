package com.tencent.pattern.command;

/**
 * Created by masonqwli on 16/1/16.
 */
public class Light {
	private String name;
	public Light(String lightName) {
		this.name = lightName;
	}
	public void on() {
		System.err.println(name + " light on");
	}

	public void off() {
		System.err.println(name + " light off");
	}
}
