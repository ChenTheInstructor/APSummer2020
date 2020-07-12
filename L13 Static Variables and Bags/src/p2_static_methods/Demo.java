package p2_static_methods;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
//		Person p1 = new Person("Adam", 3.5);
//		System.out.println(p1);
//		
//		Person p2 = new Person("Bill", 3.0);
//		System.out.println(p2);
////		
//		Person p3 = new Person("Cathy", 4.0);
//		
//		Person.setCount(2000);
//		Person p4 = new Person("David", 2.0);
//		System.out.println(p4);
//		System.out.println(p3);
		
//		Person.setCount(1000); // to use a static method, one doesn't need to have an object first
//		Person p1 = new Person("A", 4.0);
//		System.out.println(p1);
		
		for (int i = 0; i < 100; i++) {
			System.out.print(5 + (int) (Math.random() * 6) + " ");
		}
		
	}

}
