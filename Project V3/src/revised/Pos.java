package revised;

import java.util.Scanner;

public class Pos {
	// constants
	private static final String RESTAURANT_NAME = "Terry's Restaurant";
	private static final String RESTAURANT_PHONE = "(631-123-4567)";
	private static final String HEADER_FORMAT = "%n%25s%n%23s%n%n%-10s%10s%10s";
	private static final String LINE = "-------------------------------";
	private static final String MENU_ITEM_FORMAT = "%-10d%10s%10.2f%n";
	private static final String MENU_EXIT_FORMAT = "%-10s";
	private static final int TOTAL_MENU_ITEMS = 4;

	private static Scanner scan = new Scanner(System.in);
	// flags
	private static boolean receiptFlag = false;
	private static boolean isEndOfDayFlag = false;

	// arrays
	private static String[] descriptions = new String[TOTAL_MENU_ITEMS];
	private static double[] prices = new double[TOTAL_MENU_ITEMS];
	private static double[] subtotal = new double[TOTAL_MENU_ITEMS];

	// static variables with initial values
	private static double grandTotal = 0.0;

	private static int[] itemsOrdered = new int[TOTAL_MENU_ITEMS];
	private static int[] quantity = new int[TOTAL_MENU_ITEMS];

	// static variables with initial values
	private static int numOfOrders = 0; //
	private static int itemCounter = 0;

	public static void main(String[] args) {
		UserBag userBag = new UserBag(100);
		MenuItemBag menuItemBag = new MenuItemBag(100);
		fillUserBag(userBag, 2);
		fillMenuItemBag(menuItemBag, 5);
		do {
			System.out.println("Enter username: ");
			String userName = scan.nextLine();
			System.out.println("Enter password: ");
			String password = scan.nextLine();
			if (login(userBag, userName, password)) {
				break;
			}
		} while (true);
		
		
		do {
			menuItemBag.displayMenu();
			chooseItemsAndQuantity();
			if (isEndOfDay()) {
				isEndOfDayFlag = true;
				showReports();
			}
		} while (!isEndOfDayFlag);

	}

	private static void fillMenuItemBag(MenuItemBag menuItemBag, int i) {
		MenuManager.fillMenuBag(menuItemBag, i);
	}

	private static void fillUserBag(UserBag userBag, int numberOfUsers) {
		UserManager.createUsers(userBag, numberOfUsers);
	}

	private static void chooseItemsAndQuantity() {

		System.out.println("Enter item number: ");
		int itemNumber = scan.nextInt();
		int index = 0;
		if (itemNumber != 0 && itemNumber != 100) {
			askQuantity();
			index = itemNumber - 1;
			itemsOrdered[itemCounter] = index;
			quantity[itemCounter++] = numOfOrders;
		} else if (itemNumber == 0) {
			showReceipt();
			reset();
		} else {
			isEndOfDayFlag = true;
		}
	}

	private static void reset() {
		itemsOrdered = new int[TOTAL_MENU_ITEMS];
		quantity = new int[TOTAL_MENU_ITEMS];
		itemCounter = 0;
	}

	private static void showReceipt() {
		showReciptHeader();
		double total = 0.0;
		for (int i = 0; i < itemCounter; i++) {
			System.out.printf(MENU_ITEM_FORMAT, quantity[i], descriptions[itemsOrdered[i]],
					(prices[itemsOrdered[i]] * quantity[i]));

			total += (prices[itemsOrdered[i]] * quantity[i]);
		}
		System.out.println("TOTAL:\t\t\t" + total);
		calculateTotal(total);
	}

	private static void askQuantity() {
		System.out.println("Enter the number of orders you want to order");
		numOfOrders = scan.nextInt();

	}

	private static void showReports() {
		showTotalHeader();
		System.out.println("The GrandTotal is: " + grandTotal);

	}

	private static void showTotalHeader() {
		System.out.printf(HEADER_FORMAT, RESTAURANT_NAME, RESTAURANT_PHONE, "NUMBER_OF_ITEMS_TOTAL", "DESCRPTION",
				"Subtotal");
		System.out.println(LINE);

	}

	private static void calculateTotal(double total) {
		grandTotal += total;
	}

	private static void showReciptHeader() {

		System.out.printf(HEADER_FORMAT, RESTAURANT_NAME, RESTAURANT_PHONE, "NUMBER_OF_ITEMS ", "DESCRPTION",
				"Subtotal");
		System.out.println("\n" + LINE);

	}

	private static void showMenu() {
		showHeader();
		showItems();
		showEndOfOrder();
		showEndOfDay();

	}

	private static void showEndOfDay() {
		System.out.printf("%-10d%20s%n", 100, "End Of Day");

	}

	private static void showEndOfOrder() {
		System.out.printf("%-10d%20s%n", 0, "Exit");

	}

	private static void showItems() {
		fillItems();
		fillPrices();
		displayItems();

	}

	private static void displayItems() {
		System.out.println("\n" + LINE);
		for (int i = 0; i < TOTAL_MENU_ITEMS; i++) {

			System.out.printf(MENU_ITEM_FORMAT, i + 1, descriptions[i], prices[i]);
		}
	}

	private static void fillItems() {
		descriptions[0] = "pork";
		descriptions[1] = "LAMB";
		descriptions[2] = "BEEF";
		descriptions[3] = "FISH";

	}

	private static void fillPrices() {
		prices[0] = 9.99;
		prices[1] = 13.99;
		prices[2] = 15.99;
		prices[3] = 9.99;
	}

	private static boolean login(UserBag userBag, String userName, String password) {
		return UserManager.isLoggedIn(userBag, userName, password);
	}

	private static boolean isEndOfDay() {

		return isEndOfDayFlag;
	}

	private static void showHeader() {
		System.out.printf(HEADER_FORMAT, RESTAURANT_NAME, RESTAURANT_PHONE, "ITEM", "DESCRPTION", "PRICE");

	}

}
