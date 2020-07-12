package p3_inheritance_polymorphism;

import java.util.Date;

public class DemoDate {

	public static void main(String[] args) throws InterruptedException {
		Date d1 = new Date();
		System.out.println(d1);
		Thread.sleep(5000);
		Date d2 =  new Date();
		System.out.println(d2);
		System.out.println(d1.compareTo(d2));
		
		System.out.println(new Date(100000030343l));
	}

}
