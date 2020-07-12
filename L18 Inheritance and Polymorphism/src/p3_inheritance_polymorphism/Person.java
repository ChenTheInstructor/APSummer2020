package p3_inheritance_polymorphism;

// parent class
// base class
// superclass
public class Person {
	private String name;
	private String id;
	
	
	private static int idCounter=0;

	public Person(String name) {
		super();
		this.name = name;
		this.id = String.valueOf(idCounter++);
	}
	
	private void showName() {
		System.out.println(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}
