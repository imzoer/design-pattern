package com.tencent.pattern.visitor;

/**
 * Created by masonqwli on 16/2/2.
 */
public class VisitorDemoMain {
	public static void main(String[] args) {
		ICarElement car = new Car();
		car.accept(new CarElementPrintVisitor());
		car.accept(new CarElementDoVisitor());
	}
}
