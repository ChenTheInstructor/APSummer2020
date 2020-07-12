package p1_hw_1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Bike bike1 = new Bike();
		System.out.println(bike1);
		Bike bike2 = new Bike("Red", 10, 50);
		System.out.println(bike2);
		bike2.setColor("White");
		System.out.println(bike2);
		bike2.speedUp();
		System.out.println(bike2);
		
		for (int i = 0; i < 10; i++) {
			bike2.slowDown();
		}
		System.out.println(bike2.getSpeed());
		
		System.out.println(bike2.getColorAndSpeed());
		
		bike2.setColorAndCost("Blue", 500);
		System.out.println(bike2);
		System.out.println("Enter a new color for bike 2: ");
		Scanner scan = new Scanner(System.in);
		String newColor = scan.nextLine();
		bike2.setColor(newColor);
		System.out.println("Bike 2's new color is now: " + bike2.getColor());
		
	}

}
