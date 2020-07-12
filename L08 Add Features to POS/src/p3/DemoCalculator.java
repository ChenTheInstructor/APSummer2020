package p3;

import java.util.Scanner;

public class DemoCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		System.out.println("The sum is: " + add(number1, number2));
		System.out.println("The difference is: " + subtract(number1, number2));
		System.out.println("The product is: " + multiply(number1, number2));
		System.out.println("The quotient is: " + divide(number1, number2));
		
		System.out.println(multiply(number2));
		System.out.println(multiply(number1));
	}

	private static int add(int number1, int number2) {
		return (number1 + number2);
	}
	
	private static int subtract(int number1, int number2) {
		return (number1 - number2);
	}
	
	// overloaded methods
	private static int multiply(int number1, int number2) {
		return (number1 * number2);
	}
	
	private static int multiply(int number) {
		return number * number;
	}
	
	private static double divide(int number1, int number2) {
		return ((double)number1 / number2);
	}

}
