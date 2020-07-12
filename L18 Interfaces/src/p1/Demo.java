package p1;

public class Demo {

	public static void main(String[] args) {
		Dog dog1 =  new Dog("A", 5);
		dog1.playTrick();
		Cat cat1 = new Cat("B", 20);
		cat1.playTrick();
		
		System.out.println(cat1 instanceof Cat);
		// One cannot instantiate an abstract class
		
//		AnimalBehavior a1 = new AnimalBehavior("C");
	}

}
