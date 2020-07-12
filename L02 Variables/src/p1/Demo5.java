package p1;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		System.out.println("Your age is: " + age);
		
		scanner.nextLine(); // consumer the line break left behind from nextInt()
		
		System.out.println("Enter a name: ");
		String name = scanner.nextLine();
		System.out.println("Your name is: " + name);
		
		
		
	}

}
