package com.tencent.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by masonqwli on 16/1/22.
 */
public class PancakeHouseMenu implements Menu {
	private List<MenuItem> items;

	public PancakeHouseMenu() {
		items = new ArrayList<MenuItem>();
		items.add(0, new MenuItem("pancake item 1", 1.0));
		items.add(0, new MenuItem("pancake item 2", 2.0));
		items.add(0, new MenuItem("pancake item 3", 3.0));
		items.add(0, new MenuItem("pancake item 4", 4.0));
	}

	@Override
	public Iterator createIterator() {
		return new Iterator() {
			private int position = 0;

			@Override
			public boolean hasNext() {
				return position < items.size();
			}

			@Override
			public Object next() {
				return items.get(position++);
			}
		};
	}

	@Override
	public void addItem(int pos, MenuItem item) {
		items.add(item);
	}
}
