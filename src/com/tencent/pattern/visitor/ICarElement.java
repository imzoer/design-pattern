package com.tencent.pattern.visitor;

/**
 * Created by masonqwli on 16/2/2.
 */
public interface ICarElement {
	void accept(ICarElementVisitor visitor);
}
