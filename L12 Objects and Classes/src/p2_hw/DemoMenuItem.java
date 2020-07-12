package p2_hw;

import java.util.Scanner;

public class DemoMenuItem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MenuItem[] menuItemArray = new MenuItem[100];
		int menuItemCount = 0;
		String menuItemFormat = "%-5d%10S%5d%10.2f%10.2f%n";
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Enter itemNumber, description, price, and quantity: ");
			String entry = scan.nextLine();
			String[] entryTokens = entry.split(" ");
			int itemNumber = Integer.parseInt(entryTokens[0]);
			String description = entryTokens[1];
			double price = Double.parseDouble(entryTokens[2]);
			MenuItem menuItem = new MenuItem(itemNumber, description, price);
			int quantity = Integer.parseInt(entryTokens[3]);
			menuItem.setQuantity(quantity);
			menuItem.setSubtotal();
			menuItemArray[menuItemCount++] = menuItem;
			System.out.printf(menuItemFormat, itemNumber, description, quantity, price, menuItem.getSubtotal());
			System.out.println();
		}
		
		for(int i = 0; i < menuItemCount; i++) {
			System.out.println(menuItemArray[i]);
		}
		
	}

}
