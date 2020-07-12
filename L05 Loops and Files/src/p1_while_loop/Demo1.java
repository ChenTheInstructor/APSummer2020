package p1_while_loop;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number = -10.0; // scope of variables
		int count = 0;
//		while (number >= 0.0) { // pre-test
//			System.out.println("Enter a number: ");
//			number = scanner.nextDouble();
//			System.out.println("The number is: " + number);
//		}

		while (true) { // infinite loop
			if(count > 4) {
				break;
			}
			System.out.println("Enter a number: ");
			number = scanner.nextDouble();
			System.out.println("The number is: " + number);
			count++;
		}
		System.out.println(number);
	}

}
