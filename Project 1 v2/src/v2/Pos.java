package v2;

import java.util.Scanner;

public class Pos {
	private static final String RESTAURANT_NAME = "Terry's Restaurant";
	private static final String RESTAURANT_PHONE = "(631)123-4567";
	private static final String LINE = "----------------------------------------";
	private static final String HEADER_FORMAT = "%25s%n%23s%n%n%-10s%10s%10s";
	private static final String MENU_ITEM_FORMAT = "%-5d%10s%10.2f%n";
	private static final String MENU_EXIT_FORMAT = "%-5s%10s%10s%n";

	private static final int TOTAL_MENU_ITEMS = 4;
	private static Scanner scan = new Scanner(System.in);
	private static boolean isEndOfdayFlag = false;

	private static String[] descriptions = new String[TOTAL_MENU_ITEMS];
	private static double[] prices = new double[TOTAL_MENU_ITEMS];
	private static int[] numberOfItems = new int[TOTAL_MENU_ITEMS];

	public static void main(String[] args) {
		login();

		do {
			showMenu();
			chooseItemsAndQuantity();
			showReceipt();
			if (isEndOfDay()) {
				isEndOfDayFlag = true;
				showReports();
			}
		} while (!isEndOfdayFlag);

	}

	private static void showMenu() {
		showHeader();
		showItems();
		showEndOfOrder();
		showEndOfDay();
	}

	private static void showItems() {
		fillItems();
		fillPrices();
		displayItems();
	}

	private static void displayItems() {
		for (int i = 0; i < TOTAL_MENU_ITEMS; i++) {
			System.out.println("\n" + LINE);
			System.out.printf(MENU_ITEM_FORMAT, (i+1), descriptions[i], prices[i]);
		}
	}

	private static void fillPrices() {
		prices[0] = 9.99;
		prices[1] = 12.99;
		prices[2] = 15.99;
		prices[3] = 9.99;
	}

	private static void fillItems() {
		descriptions[0] = "PORK";
		descriptions[1] = "LAMB";
		descriptions[2] = "BEEF";
		descriptions[3] = "FISH";
	}

	private static void showHeader() {
		System.out.printf(HEADER_FORMAT, RESTAURANT_NAME, RESTAURANT_PHONE, "ITEM", "DESCRIPTION", "PRICE");
		System.out.println(LINE);
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

	private static boolean isEndOfDay() {
		if (itemChoosen == -1)
		return true;
		else {
			return false;
		}
	}

}
