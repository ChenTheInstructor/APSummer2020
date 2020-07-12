package p1;

public class Demo1 {

	public static void main(String[] args) {
		char ch; // 2 bytes
		ch = 'A';
		System.out.println(ch);
		ch = 'd';
		System.out.println(ch);
		
		int number; // declared it  4 bytes
		number = 109;
		System.out.println(number);
		int quotient = number / 10;
		int remainder  = number % 10;
		System.out.println("Quotient is: " + quotient);
		System.out.println("Remainder is: " + remainder);
		
		double doubleNumber = 100;  // 8 bytes
		double result = doubleNumber / 3;
		System.out.println(doubleNumber);
		System.out.println(result);
		
		
		
		
	}

}
