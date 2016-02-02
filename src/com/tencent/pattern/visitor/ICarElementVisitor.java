package com.tencent.pattern.visitor;

/**
 * Created by masonqwli on 16/2/2.
 */
public interface ICarElementVisitor {
	void visit(Wheel wheel);

	void visit(Engine engine);

	void visit(Body body);

	void visit(Car car);
}
