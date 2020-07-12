package p1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter an integer: ");
			try {
				int n = scan.nextInt();
				total += n;
			} catch (Exception e) {
				do {
					scan.nextLine();
					System.out.println("Incorrect input. Enter an integer: ");
					try {
						int n = scan.nextInt();
						total += n;
						break;
					} catch (Exception e1) {
						continue;
					}
				} while (true);
			}
		}
		System.out.println("Total is: " + total);
	}

}
