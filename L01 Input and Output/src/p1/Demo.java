package p1;

import java.util.Scanner;

public class Demo {
	
	// method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println("Enter your address: ");
		String address = input.nextLine();
		System.out.printf("%-10S%20s%n", "NAME", "ADDRESS");
		System.out.println("----------------------------------------------");
		System.out.printf("%-10S%20s%n", name, address);
		
	}

}
