package com.tencent.pattern.visitor;

/**
 * Created by masonqwli on 16/2/2.
 */
public class CarElementDoVisitor implements ICarElementVisitor {
	public void visit(Wheel wheel) {
		System.out.println("Kicking my " + wheel.getName() + " wheel");
	}

	public void visit(Engine engine) {
		System.out.println("Starting my engine");
	}

	public void visit(Body body) {
		System.out.println("Moving my body");
	}

	public void visit(Car car) {
		System.out.println("Starting my car");
	}
}
