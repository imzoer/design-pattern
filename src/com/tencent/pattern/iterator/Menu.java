package com.tencent.pattern.iterator;

/**
 * Created by masonqwli on 16/1/22.
 */
public interface Menu {
	Iterator createIterator();

	void addItem(int pos, MenuItem item);
}
