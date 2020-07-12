package p3_inheritance_polymorphism;

public class DemoInheritance {

	public static void main(String[] args) {
		Student s1 = new Student("Adam",  3.5);
		Teacher t1 = new Teacher("Bill", 50000.99);
		
		// child classes get everthing from the parent class 
		// as long as those things are not private.
		// Inheritance describes the "is a" relationship!
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getSalary());
		
		
		System.out.println(s1.getName());
		System.out.println(s1.getId());
		System.out.println(s1.getGpa());
	}

}
