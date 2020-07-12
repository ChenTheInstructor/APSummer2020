package p1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i*2;
		}
		System.out.println(Arrays.toString(arr));
//		Scanner scan = new Scanner(System.in);
//		
//		int[] arr = new int[5];
//		System.out.println("Enter a number: ");
//		
//		int number = 0;
//		
//		try {
//			number = scan.nextInt();
//			arr[5] = number;
//		} catch (InputMismatchException e) {
//			e.printStackTrace();
////		} catch (ArrayIndexOutOfBoundsException e) {
////			System.out.println(e.getMessage());
////		} catch (Exception e) {
////			System.out.println(e.getMessage());
//		} finally {
//			System.out.println("This is inside the finally clause");
//			// any code here will be executed now matter what!
//		}
//		
//		System.out.println("The number entered is " + number);
	}

}
