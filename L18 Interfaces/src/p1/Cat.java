package p1;

public class Cat extends AnimalBehavior {
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
		return "Cat [name=" + getName() + ", weight=" + weight + "]";
	}


	@Override
	public void playTrick() {
		System.out.println("The cat jumps!");
	}

}
