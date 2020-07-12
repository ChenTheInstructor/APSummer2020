package p3_inheritance_polymorphism;

public class DemoPolymorphism {

	public static void main(String[] args) {
//		PersonBag theBag = new PersonBag(100);
//		Person p1 = new Person("A", "1");
//		Person p2 = new Person("B", "2");
//
//		theBag.insert(p1);
//		theBag.insert(p2);
//
//		Student s1 = new Student("s1", "s11", 3.5);
//		Teacher t1 = new Teacher("t1", "t11", 20000);
//
//		theBag.insert(s1);// ok because a student is a person
//		theBag.insert(t1); // ok becayse a teacher is a person
//		
//		Cat c1 = new Cat("c1", "c11", 10);
//		theBag.insert(c1);
//
//		theBag.display();
		
		Person p1 = new Person("p1");
		
		// a variable of super class type can be used to store objects of subclass type
		// we can decouple variable type from object type
		// p2's variable type is Person
		// p2's object type is Student
		
		Person p2 = new Student("s1", 3.5); 
		Person p3 = new Teacher("t1", 20000);
		showPerson(p1);
		showPerson(p2);
		showPerson(p3);
		
 
	}
	
	public static void showPerson(Person person) {
		System.out.println(person);
	}

}
