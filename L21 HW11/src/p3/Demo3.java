package p3;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a name: ");
		String name = scan.nextLine();

		System.out.println("Enter a zip: ");
		String zip = scan.nextLine();
		
		
		Person p = new Person(name, zip);
		p.setZip("123213232");
		
		System.out.println(p);
	}

}
