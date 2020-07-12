package p3_guess_password;

import java.util.Scanner;

public class JasonsDemo {
	private static String line = "-------------------------";
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		showMenu();
		System.out.println("What would you like to order?");
		String food = scanner.nextLine();
		double price = 0.0;
		switch (food) {
		case "Pork":
			price = 9.99;
			break;
		case "Beef":
			price = 12.99;
			break;
		case "Lamb":
			price = 15.99;
			break;
		case "Veggie":
			price = 7.99;
			break;
		default:
			System.out.println("There is no such item on the menu.");
		}
		System.out.println("The price of the food you ordered is " + price + "$");
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
}
