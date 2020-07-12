package p4_default_methods;

public class Demo {

	public static void main(String[] args) {
		ComputerIF c1 = (m, n) -> {
			return m + n;
		};
		
		System.out.println(c1.compute(20, 10));
		System.out.println(c1.power1(2,  3));
		
		System.out.println(ComputerIF.power2(3, 2));
	}

}
