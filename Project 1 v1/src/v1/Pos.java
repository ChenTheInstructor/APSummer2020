package v1;

import java.util.Scanner;

public class Pos {

	private static Scanner scan = new Scanner(System.in);
	private static String line = "----------------------------------------";
	private static String menuItemFormat = "%-5s%10s%10.2f%n";
	private static String menuExitFormat = "%-5s%10s%10s%n";
	private static String item ="";
	private static double price =0.0;
	private static double subtotal = 0.0;
	private static int numberOfOrders = 0;
	private static double total = 0.0;
	private static boolean flag = true;
	private static String[] items = new String[4];
	
	private static double[] prices = new double[4];
	private static int[] numberOfItems = new int[4];
			
	
	public static void main(String[] args) {
		login();
		do {
			showmenu();
			chooseItem();
//			printReceipt();
		} while (flag);
	}

	private static void login() {

		do {
			System.out.println("Enter a Username");
			String user = scan.nextLine();
			System.out.println("Enter a Password");
			String password = scan.nextLine();
			if (password.contentEquals("q") && user.contentEquals("w")) {
				System.out.println("Sucess!\n");
				break;
			}
			System.out.println("incorrect username or password!\n");
		} while (true);
	}

	private static void showmenu() {
		System.out.printf("%25s%n%23s%n%n%-10s%10s%10s", "Terry's Restaurant", "(631-123-4567)", "Number", "Food",
				"Price");
		fillItems();
		fillPrices();
		System.out.println("\n" + line);
		System.out.printf(menuItemFormat, "1", items[0], prices[0]);
		System.out.printf(menuItemFormat, "2", items[1], prices[1]);
		System.out.printf(menuItemFormat, "3", items[2], prices[2]);
		System.out.printf(menuItemFormat, "4", items[3], prices[3]);
		System.out.printf(menuExitFormat, "0", "", "Exit");
	}

	private static void chooseItem() {
		System.out.println(line);
		
		System.out.println("Enter the item you want to order:");
		int num = scan.nextInt();
		System.out.println("Enter the number of orders:");
		numberOfOrders = scan.nextInt();
	
		switch (num) {
		case 1:
			item = "Pork";
			price = 9.99;
			subtotal = price * numberOfOrders;
			showItem();
			break;
		case 2:
			item = "Lamb";
			price = 12.99;
			subtotal = price * numberOfOrders;
			showItem();
			break;
		case 3:
			item = "Beef";
			price = 15.99;
			subtotal = price * numberOfOrders;
			showItem();
			break;
		case 4:
			item = "Fish";
			price = 9.99;
			subtotal = price * numberOfOrders;
			showItem();
			break;
		case 0: 
			System.out.println("The program ended.");
			System.out.println("The total revenue is: $" + total);
			flag = false;
			break; 
		default: 
			System.out.println("No such item.");
		}
		total += price;
		
		
	}
	
	private static void showItem() {
		System.out.println("You've chosen " + numberOfOrders + " " + item + " and its price is $" + price + ".");
		System.out.println("The subtotal is: " + subtotal);
		System.out.println(line);
		System.out.println();
	}
	
	private static void fillItems() {
		items[0] = "PORK";
		items[1] = "LAMB";
		items[2] = "BEEF";
		items[3] = "FISH";
	}
	
	private static void fillPrices() {
		prices[0] = 9.99;
		prices[1] = 12.99;
		prices[2] = 15.99;
		prices[3] = 9.99;
	}

}
