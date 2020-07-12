package p2_hw_2;

public class Demo {

	public static void main(String[] args) {
		Animal cat1 = new Animal("Cat", 5, 5.5);
		System.out.println(cat1);
		cat1.grow();
		System.out.println(cat1);
		cat1.feed(100);
		System.out.println(cat1);
	}

}
