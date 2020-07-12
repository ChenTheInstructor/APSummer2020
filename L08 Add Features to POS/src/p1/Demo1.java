package p1;

import java.util.Scanner;

public class Demo1 {
	private static Scanner scan = new Scanner(System.in);

	private static int totalMenuItems = 0;
	private static String[] descriptions = new String[totalMenuItems];
	private static double[] prices = new double[totalMenuItems];

	public static void main(String[] args) {
		showDescriptionsAndPrices();
		for (int i = 0; i < 4; i++) {
			addNewItem();
		}
		showDescriptionsAndPrices();
		removeItem();
		showDescriptionsAndPrices();
		editDescription();
		showDescriptionsAndPrices();
		editPrice();
		showDescriptionsAndPrices();

	}

	private static void showEditMenu() {

	}

//	private static void adjustItemNumber() {
//		System.out.println("Enter the number of total menu items:");
//		totalMenuItems = scan.nextInt();
//		System.out.println("The number of total menu item is: " + totalMenuItems);
//	}

	private static void addNewItem() {
		System.out.println("Enter the description: ");
		String description = scan.nextLine();
		System.out.println("Enter the price: ");
		double price = scan.nextDouble();
		scan.nextLine(); // consume the extra enter
		String[] newDescriptions = new String[totalMenuItems + 1];
		double[] newPrices = new double[totalMenuItems + 1];
		for (int i = 0; i < totalMenuItems; i++) {
			newDescriptions[i] = descriptions[i];
			newPrices[i] = prices[i];
		}
		descriptions = newDescriptions; // rename the descriptions array
		prices = newPrices; // rename the prices array
		descriptions[totalMenuItems] = description.toUpperCase();
		prices[totalMenuItems] = price;
		totalMenuItems++;
	}

	private static void showDescriptionsAndPrices() {
		for (int i = 0; i < totalMenuItems; i++) {
			System.out.println(descriptions[i] + "\t" + prices[i]);
		}
	}

	private static void removeItem() {
		System.out.println("Enter the description of the item to remove: ");
		String description = scan.nextLine();
		for (int i = 0; i < totalMenuItems; i++) {
			if (descriptions[i].equalsIgnoreCase(description)) {
				for (int j = i; j < totalMenuItems - 1; j++) {
					descriptions[j] = descriptions[j + 1];
					prices[j] = prices[j + 1];
				}
				totalMenuItems--;
			}
		}
	}

	private static void editDescription() {
		System.out.println("Enter the description to edit: ");
		String description = scan.nextLine();
		System.out.println("Enter the new description to change to: ");
		String newDescription = scan.nextLine();
		for (int i = 0; i < totalMenuItems; i++) {
			if (descriptions[i].equalsIgnoreCase(description)) {
				descriptions[i] = newDescription.toUpperCase();
			}
		}
	}

	private static void editPrice() {
		System.out.println("Enter the description to edit price: ");
		String description = scan.nextLine();
		System.out.println("Enter the new price to change to: ");
		double newPrice = scan.nextDouble();
		for (int i = 0; i < totalMenuItems; i++) {
			if (descriptions[i].equalsIgnoreCase(description)) {
				prices[i] = newPrice;
			}
		}

	}
}
