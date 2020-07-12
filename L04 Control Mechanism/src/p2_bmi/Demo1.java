package p2_bmi;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your weight: ");
		double weight = scanner.nextDouble();
		System.out.println("Enter your height: ");
		double height = scanner.nextDouble();
		
		double bmi = 703.0*(weight/ (height * height));
		System.out.println("Your BMI is " + bmi);
		
	}

}
