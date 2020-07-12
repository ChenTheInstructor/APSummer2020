package p3_copy_objects;

public class Animal {
	
	private String type;
	private int age;
	private double weight;
	
	public Animal(String type, int age, double weight) {
		this.type = type;
		this.age = age;
		this.weight = weight;
	}

	public Animal() {
		super();
	}
	
	public Animal(Animal animal) {
		this.type = animal.type;
		this.age = animal.age;
		this.weight = animal.weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void grow( ) {
		age++;
	}
	
	public void feed(double amount) {
		weight = weight + 0.3* amount;
	}
	
	public Animal deepCopy(Animal newAnimal) {
		return new Animal(newAnimal);
	}
	
	public Animal shallowCopy(Animal newAnimal) {
		return newAnimal;
	}
	
	public void playTrick(String trick) {
		if(type.equalsIgnoreCase("Dog")) {
			System.out.println("The dog jumps 5 feet!" );
		} else if(type.equalsIgnoreCase("Cat")) {
			System.out.println("The cat jumps 10 feet!");
		} else {
			System.out.println("The type is unknown. So no idea how high it can jump.");
		}
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
	
	
	

}
