package p3;

import java.util.ArrayList;

import p2_hw.MenuItem;

public class DemoArrayList {

	public static void main(String[] args) {
//		int arraySize = 5;
//		MenuItem [] menuItemArray = new MenuItem[arraySize];
//		System.out.println(menuItemArray.length);
//		
//		arraySize = 10;
//		System.out.println(menuItemArray.length);
		
		MenuItem item1 = new MenuItem(1, "PORK", 9.99);
		MenuItem item2 = new MenuItem(2, "Lamb", 10.99);
		MenuItem item3 = new MenuItem(3, "Beef", 19.99);
		MenuItem item4 = new MenuItem(4, "FISh", 15.99);
		MenuItem item5 = new MenuItem(5, "VEGGIE", 7.99);
		MenuItem item6 = new MenuItem(6, "Drink", 2.99);
		
		ArrayList<MenuItem> list1 = new ArrayList<>();
		list1.add(item1);
		list1.add(item2);
		list1.add(item3);
		list1.add(item4);
		list1.add(item5);
		list1.add(item6);
		
//		MenuItem newItem = list1.get(5);
//		newItem.setDescription("Soda");
		list1.get(5).setDescription("Juice");
		
		
		// find and change
		for(int i = 0; i < list1.size(); i++) {
			if(list1.get(i).getDescription().equalsIgnoreCase("beef")) {
				list1.get(i).setPrice(2.99);
			}
		}
		
		// display
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		
		
		
		
		
	}

}
