package p3_switch_case;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an whole number: ");
		int number = scanner.nextInt();

		switch (number) {
		case 1:
			System.out.println("You entered 1");
			break;
		case 2:
			System.out.println("You entered 2");
			break;
		default:
			System.out.println("You entered something else.");

		}
	}

}
