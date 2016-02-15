package com.tencent.pattern.iterator;

/**
 * Created by masonqwli on 16/2/15.
 */
public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator panIt = pancakeHouseMenu.createIterator();
		Iterator dinerIt = dinerMenu.createIterator();
		System.out.println("MENU:");
		print(panIt);
		print(dinerIt);
	}

	private void print(Iterator it) {
		while (it.hasNext()) {
			MenuItem item = (MenuItem) it.next();
			System.err.println(item.getName() + "-" + item.getPrice());
		}
	}
}
