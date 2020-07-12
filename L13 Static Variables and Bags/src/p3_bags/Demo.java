package p3_bags;

public class Demo {

	public static void main(String[] args) {
		PersonBag myBag = new PersonBag(100);
		Person p1 = new Person("A", 1.0);
		Person p2 = new Person("B", 2.0);
		Person p3 = new Person("C", 3.0);
		Person p4 = new Person("D", 4.0);
		myBag.insert(p1);
		myBag.insert(p2);
		myBag.insert(p3);
		myBag.insert(p4);
		myBag.display();
		System.out.println("-----Find by ID------");
		System.out.println(myBag.findById("0"));
		System.out.println("-----Remove by ID------");
		System.out.println(myBag.removeById("2"));
		System.out.println("-----show bag after removal-----");
		myBag.display();
	}

}
