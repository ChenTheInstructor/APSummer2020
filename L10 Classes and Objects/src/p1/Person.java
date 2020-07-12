package p1;

// a class is just a template we create to construct objects
public class Person {
	// instance variables, fields, instance fields, attributes, properties
	// objects == instances
	private String name;
	private  double height;
	private int age;
	
	// behaviors:
	// constructors
	// overloaded methods (constructors)
	public Person() {
		
	}
	
	public Person(String name, double height, int age) { // n, h and a are local variables
		this.name = name;
		this.height = height;
		this.age = age;
	}
	
	public void setName(String name) { // setter, mutator
		this.name = name;
	}
	
	public String getName() { // getter, accessor
		return name;
	}
	
	public void setHeight(double height) { // setter, mutator
		this.height = height;
	}
	
	public double getHeight() { // getter, accessor
		return height;
	}
	
	public void eat(String food) {
		System.out.println(name + " is eating " + food + ".");
		if (food.equalsIgnoreCase("pasta")) {
			height += 0.1;
		} else if (food.equalsIgnoreCase("Meat")) {
			height += 0.5;
		} else {
			height += 0.2;
		}
	}
	
	public void walk(double distance ) {
		System.out.println(name + " walks " +  distance + " miles a day!");
	}
	
	public void study() {
		System.out.println(name + " studies!");
	}
	
	public String toString() {
		return name + ": " + height + " inches, " + age + " years old!";  
	}
	
}
