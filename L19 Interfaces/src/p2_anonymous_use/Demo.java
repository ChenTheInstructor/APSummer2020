package p2_anonymous_use;

public class Demo {

	public static void main(String[] args) {
		ComputerIF add = new ComputerIF() {

			@Override
			public double compute1(double number1, double number2) {
				return number1 + number2;
			}

			@Override
			public double compute2(double number1, double number2) {
				return number1 - number2;
			}
			
		};
		
		System.out.println(add.compute1(10,  20));
		System.out.println(add.compute2(10, 20));
		
		ComputerIF subtract = new ComputerIF() {

			@Override
			public double compute1(double number1, double number2) {
				return number1 - number2;
			}

			@Override
			public double compute2(double number1, double number2) {
				// TODO Auto-generated method stub
				return 0;
			}

	
		};
		
		System.out.println(subtract.compute1(10,  20));
		System.out.println(subtract.compute2(10,  20));
	}

}
