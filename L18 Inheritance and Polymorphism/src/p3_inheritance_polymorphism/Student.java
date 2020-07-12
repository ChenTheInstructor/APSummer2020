package p3_inheritance_polymorphism;

public class Student extends Person {
	private double gpa;
	
	public Student(String name, double gpa) {
		super(name);
		this.gpa = gpa;	
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [Name=" + getName() + ", ID=" + getId() + ", GPA=" + gpa + "]";
	}

//	@Override
//	public String toString() {
//		return "Student [Person=" + super.toString() + ", gpa=" + gpa + "]";
//	}

	
	
	

}
