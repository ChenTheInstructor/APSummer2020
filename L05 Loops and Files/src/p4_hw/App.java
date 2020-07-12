package p4_hw;

import java.util.Scanner;

public class App {
	private static String line = "-------------------------";
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		login();
		order();
	}

	private static void order() {
		do {
			showMenu();
			placeOrder();
		} while (true);
	}

	private static void placeOrder() {
		System.out.println("What would you like to order?");
		int itemNumber = scanner.nextInt();
		double price = 0.0;
		String item = "";
		switch (itemNumber) {
		case 1:
			item = "Pork";
			price = 9.99;
			break;
		case 2:
			item = "Beef";
			price = 12.99;
			break;
		case 3:
			item = "Lamb";
			price = 15.99;
			break;
		case 4:
			item = "Veggie";
			price = 7.99;
			break;
		default:
			System.out.println("There is no such item on the menu.");
		}
		System.out.println("Your ordered " + item + " and it's $" + price + ".");
	}

	private static void showMenu() {
		showHeader();
		System.out.printf("%-5s%-10s%10f\n", "1.", "Pork", 9.99);
		System.out.printf("%-5s%-10s%10f\n", "2.", "Beef", 12.99);
		System.out.printf("%-5s%-10s%10f\n", "3.", "Lamb", 15.99);
		System.out.printf("%-5s%-10s%10f\n", "4.", "Veggie", 7.99);
		System.out.println(line + "\n");

	}

	private static void showHeader() {
		System.out.println("\n\n" + line);
		System.out.printf("%20s%n", "New York Chinese Takeout");
		System.out.printf("%20s%n", "(631) 123-4567");
		System.out.println(line);
	}

	private static boolean login() {
		do {
			System.out.println("Enter a username: ");
			String username = scanner.nextLine();
			System.out.println("Enter a password: ");
			String password = scanner.nextLine();

			if (password.contentEquals("secret") && username.contentEquals("Jason")) {
				System.out.println("Success!");
				return true;
			}
			System.out.println("Incorrect username or password. Try again!\n");
		} while (true);

	}
}
