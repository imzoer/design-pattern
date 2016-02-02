package com.tencent.pattern.visitor;

/**
 * Created by masonqwli on 16/2/2.
 */
public class Body implements ICarElement{
	public void accept(ICarElementVisitor visitor) {
		visitor.visit(this);
	}
}
