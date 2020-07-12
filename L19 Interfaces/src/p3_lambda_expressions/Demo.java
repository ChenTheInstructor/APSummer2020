package p3_lambda_expressions;

public class Demo {

	public static void main(String[] args) {
//		ComputerIF addition = new ComputerIF() {
//
//			@Override
//			public double compute(double number1, double number2) {
//				return number1 + number2;
//			}
//			
//		};
		
		ComputerIF addition = (x, y) -> {
			return x + y;
		};
		
		ComputerIF subtract = (x, y) -> {
			return x - y;
		};
		
		ComputerIF multiply = (x, y) -> {
			return x * y;
		};
		
		ComputerIF divide = (x, y) -> {
			return x / y;
		};
		
		System.out.println(addition.compute(10, 20));
		System.out.println(subtract.compute(10, 20));
		System.out.println(multiply.compute(10, 20));
		System.out.println(divide.compute(10, 20));
	}

}
