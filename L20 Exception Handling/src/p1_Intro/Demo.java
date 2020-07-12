package p1_Intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

	// exception handling is used to deal with mistakes
	// Types of mistakes:
	// 0. Logic error: passes compiler and JVM
	// 1. syntax errors are not handled by Java. Programmers are to correct them.
	// 2. Errors: Those are not handled by Java either.
	// 3. Exceptions: Those can be handled by Java.
	// 3.1: Unchecked Exceptions
	// 3.2: Checked Exceptions
	// checked or not is meant by Compiler
	public static void main(String[] args) {

		String zip = "abd123";
		for (int j = 0; j < zip.length(); j++) {
			System.out.println(Character.isDigit(zip.charAt(j)));
		}
		//
		// int x = 5;
		// int y = 5;
		// System.out.println("x + y = " + 20);
		//
		// int[] arr = new int[5];
		// try {
		// System.out.println(arr[5]);
		// System.out.println("No failure");
		// } catch (Exception e) {
		//// e.printStackTrace();
		// System.out.println("Something went wrong!");
		// }// unchecked by compiler. Failed in JVM

		// File file = new File("myFile.txt");
//		Scanner scan = null;
//		try {
//			scan = new Scanner(file);
//			System.out.println(scan.nextLine());
//		} catch (FileNotFoundException e) {
////			e.printStackTrace();
//			System.out.println("Something went wrong but it will not crash the program.");
//			System.out.println("Enter a new file name: ");
//			Scanner kb = new Scanner(System.in);
//			
//			String fileName = kb.nextLine();
//		} // checked exception
//		
	}

}
