package com.tencent.pattern.iterator;

/**
 * Created by masonqwli on 16/1/22.
 */
public class DinerMenu implements Menu {
	private MenuItem[] items;

	public DinerMenu() {
		items = new MenuItem[4];
		addItem(0, new MenuItem("item 1", 1.0));
		addItem(1, new MenuItem("item 2", 2.0));
		addItem(2, new MenuItem("item 3", 3.0));
		addItem(3, new MenuItem("item 4", 4.0));
	}

	@Override
	public Iterator createIterator() {
		return new Iterator() {
			private int position = 0;
			@Override
			public boolean hasNext() {
				return position < items.length;
			}

			@Override
			public Object next() {
				return items[position ++];
			}
		};
	}

	@Override
	public void addItem(int pos, MenuItem item) {
		items[pos] = item;
	}
}
