package p1_hw;

public class Demo1 {

	public static void main(String[] args) {
		Bike bike1 = new Bike("Black", 5, 50.99);
		System.out.println(bike1);
		
		Bike bike2 = new Bike(bike1);
		System.out.println(bike2);
		
		System.out.println("------Test deep copy----");
		
		Bike bike3 = bike2.deepCopy(bike2);
		
		System.out.println(bike3 == bike2);
		System.out.println("------Test shallow copy----");
		Bike bike4 = bike3.shallowCopy(bike3);
		System.out.println(bike3 == bike4);
		
		System.out.println("------Test a new deep copy----");
		bike2.setSpeed(100);
		Bike bike5 = bike2.deepCopy();
		System.out.println(bike5 == bike2);
		System.out.println(bike5.getSpeed());
		
		System.out.println("------Test a new shallow copy----");
		Bike bike6 = bike3.shallowCopy();
		System.out.println(bike6 == bike3);
		
		
	}

}
