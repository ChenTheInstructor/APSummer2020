package p3_switch_case;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a letter grade: ");
		String grade = scanner.nextLine();
		double score = 0;
		switch (grade) {
		case "A":
			score = 4.0;
			break;
		case "B":
			score = 3.0;
			break;
		case "C":
			score = 2.0;
			break;
		case "D":
			score = 1.0;
			break;
		case "F":
			score = 0.0;
			break;
		default:
			score = 0.0;
		}
		
		System.out.println("Your score is " + score);
	}

}
