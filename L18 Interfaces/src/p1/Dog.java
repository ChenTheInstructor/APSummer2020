package p1;

public class Dog extends AnimalBehavior {
	private int age;

	public Dog(String name, int age) {
		super(name);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + getName() + ", age=" + age + "]";
	}

	@Override
	public void playTrick() {
		System.out.println("The dog rolls over!");
	}

}
