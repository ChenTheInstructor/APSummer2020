package p1;

import java.util.Scanner;

class Demo1 {

	public static void main(String[] args) {
		// A class is a data type used to hold objects
		Person terry = new Person("Terry", 65.5, 14);
		terry.setName("Terrence");
		System.out.println(terry.getName());
		terry.eat("meat");
		System.out.println(terry.getHeight());
		
		System.out.println(terry);
		terry.setName("Terry");
		System.out.println(terry);
		
		Person j = new Person();
		j.setName("Jason");
		j.setHeight(70.5);
		System.out.println(j);
		
		
//		System.out.println(terry.name);
//		System.out.println(terry.height);
//		System.out.println(terry.age);
//		
//		Person jason = new Person("Jason", 72.0, 14);
//		System.out.println(jason.name);
//		System.out.println(jason.height);
//		System.out.println(jason.age);
//		
//		terry.eat("Pasta");
//		terry.walk(2.5);
//		jason.study();
//		
//		jason.name = "Jay";
//		System.out.println(jason.name);
		
	}

}
