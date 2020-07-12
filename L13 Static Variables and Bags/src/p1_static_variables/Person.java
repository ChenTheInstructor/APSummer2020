package p1_static_variables;

public class Person {
	// instance variables; their values change from object to object
	private String name;
	private String id;
	private double gpa;

	// static variables; they are shared by all objects of this class.
	private static int count = 1;
	
	 private final int ID_LENGTH = 8;

	 	// constructor
	 
	public Person(String name, double gpa) {
		this.name = name;
		this.id = formatId(String.valueOf(count++));
		this.gpa = gpa;
	}
	
	public Person() {
		
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	private String formatId(String rawId) {
		String formattedId = rawId;
		for(int i = 0; i < ID_LENGTH-rawId.length(); i++) {
			formattedId = "0"+ formattedId;
		}
		return formattedId;
	}

//	public void setCount(int newCount) {
//		count = newCount;
//	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", gpa=" + gpa + ", count=" + count + "]";
	}

}
