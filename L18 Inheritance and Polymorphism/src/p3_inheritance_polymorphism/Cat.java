package p3_inheritance_polymorphism;

public class Cat extends Person {
	private double weight;

	public Cat(String name, double weight) {
		super(name);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Cat [Name=" + getName() + ", ID=" + getId() + ", weight=" + weight + "]";
	}

	
	
}
