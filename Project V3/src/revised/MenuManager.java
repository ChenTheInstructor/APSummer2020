package revised;

import java.util.Scanner;

public class MenuManager {
	private static Scanner scan = new Scanner(System.in);
	
	public static void fillMenuBag(MenuItemBag menuItemBag, int numberOfItems) {
		
		for(int i = 0; i < numberOfItems; i++) {
			System.out.println("Enter description: ");
			String description = scan.nextLine();
			System.out.println("Enter price: ");
			double price = scan.nextDouble();
			scan.nextLine();
			MenuItem newItem = new MenuItem(description, price);
			menuItemBag.insert(newItem);
		}
	}

}
