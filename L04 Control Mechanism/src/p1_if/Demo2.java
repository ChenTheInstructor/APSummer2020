package p1_if;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter today's temperature: ");
		int temperature = scanner.nextInt();
		if(temperature >= 80) {
			System.out.println("Hot");
		} else if (temperature  >= 60) {
			System.out.println("Just right");
		} else if (temperature <= 40) {
			System.out.println("Cool");
		} else {
			System.out.println("Cold!");
		}
	}

}
