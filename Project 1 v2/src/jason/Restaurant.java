package jason;

import java.util.Scanner;

public class Restaurant {
	private static final String RESNAME = "Jason's Restaurant";
	private static final String RESPHONE = "(631) 125-1251";
	private static String Line = "____________________";
	private static Scanner scanner = new Scanner(System.in);
	private static String item = "";
	private static final int START_NUM = 0;
	private static double price = 0.0;
	private static double total = 0.0;
	private static boolean flag = true;
	private static String[] items = new String[] { "Pork", "Beef", "Lamb", "Veggies" };
	private static double[] prices = new double[] { 9.99, 12.99, 15.99, 7.99 };
	private static int number = START_NUM;
	private static int a = START_NUM;
	private static String[] receipt = new String[1000];
	private static int num = START_NUM;
	private static int e = -1;
	private static boolean end = false;
	private static int f = START_NUM;
	private static int g = START_NUM;
	private static int h = START_NUM;
	private static int i = START_NUM;
	private static double grandTotal = 0.0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		showLogin();
		System.out.println(Line);
		do {
			showStart();
			if (!end) {
				showHeader();
				showMenu();
				showPrice();
				receiptInfo();
				e++;
				if (!flag) {
					showReceipt();
					receipt = new String[1000];
					a = 0;
					flag = true;
					grandTotal += total;
				}
			}
		} while (!end);
	}

	private static void showMenu() {
		System.out.println("            MENU" + "\n");
		for (int i = 0; i < 4; i++) {
			System.out.printf("%-2s%-15s%10.2f\n", (i + 1) + ".", items[i], prices[i]);
		}
		System.out.printf("%-2s%-15s\n", "0.", "Receipt");
		System.out.println(Line);
	}

	private static void showHeader() {
		System.out.printf("%-20s\n%-50s\n", "Welcome to " + RESNAME, "Our phone number is " + RESPHONE);
		System.out.println(Line + "\n");
	}

	private static void showPrice() {
		System.out.println("Type the number of the food you want to order:");
		num = scanner.nextInt();
		if (num != 0) {
			System.out.println("How much of this food do you want to order?");
			number = scanner.nextInt();
		}
		if (num == 1) {
			f += number;
		}
		if (num == 2) {
			g += number;
		}
		if (num == 3) {
			h += number;
		}
		if (num == 4) {
			i += number;
		}
		switch (num) {
		case 1:
			item = "Pork";
			price = prices[num - 1] * number;
			showItem();
			total += price;
			System.out.println(Line + "\n");
			break;
		case 2:
			item = "Beef";
			price = prices[num - 1] * number;
			showItem();
			total += price;
			System.out.println(Line + "\n");
			break;
		case 3:
			item = "Lamb";
			price = prices[num - 1] * number;
			showItem();
			total += price;
			System.out.println(Line + "\n");
			break;
		case 4:
			item = "Veggie";
			price = prices[num - 1] * number;
			showItem();
			total += price;
			System.out.println(Line + "\n");
			break;
		case 0:
			flag = false;
			break;
		default:
			System.out.println("There is no such item on the menu.");
			System.out.println(Line + "\n");
		}
	}

	private static void showItem() {
		System.out.println("The price of " + number + " " + item + " is $" + price + ".");
	}

	private static boolean showLogin() {
		do {
			System.out.println("Enter your username:");
			String user = scanner.nextLine();
			System.out.println("Enter the password:");
			String password = scanner.nextLine();

			if (password.contentEquals("secret") && user.contentEquals("Jason Liu")) {
				System.out.println("You logged into your account");
				return true;
			}
			System.out.println("Incorrect password or username. Try again.\n");
		} while (true);
	}

	private static void showReceipt() {
		showHeader();
		receiptInfo();
		for (int a = 0; a < e; a++) {
			System.out.println(receipt[a]);
		}
		System.out.println("The price of everything you ordered is " + total);
		System.out.println(Line);
	}

	private static void receiptInfo() {
		String b = String.valueOf(number);
		String c = String.valueOf(price);
		String d = String.valueOf(item);
		receipt[a] = b + " " + d + " " + c;
		a++;
	}

	private static void showStart() {
		System.out.println("1. Order");
		System.out.println("2. End of day");
		int select = scanner.nextInt();
		if (select == 2) {
			showFinal();
			end = true;
		} else {
		}
	}

	private static void showFinal() {
		showHeader();
		System.out.println("The final reciept for the day is:");
		System.out.println((f + " Pork ") + "$" + (f * 9.99));
		System.out.println((g + " Beef ") + "$" + (g * 12.99));
		System.out.println((h + " Lamb ") + "$" + (h * 15.99));
		System.out.println((i + " Veggie ") + "$" + (i * 7.99));
		System.out.println("The total of all the food ordered is:" + grandTotal);
	}
}
