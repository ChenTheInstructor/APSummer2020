package p1;

public class Demo1 {

	public static void main(String[] args) {
		// one variable for one value
		int x = 5;
		int y = 10;
		x = 10;
		String name = "John";
		name = "Jason";
		
		// An array allow one variable to have many values
		// Each value is identified by an index value
		
		// how to declare an array
		int[] numbers = new int[10]; // default all elements = 0;
		numbers[0] = 100;
		System.out.println(numbers[0]);
		double[] doubleNumbers = new double[5]; // default all elements = 0.0
		System.out.println(doubleNumbers[0]);
		char[] charValues = new char[20]; // default all elements = ""
		System.out.println(charValues[0]);
		String[] names = new String[50]; // defaults all elememts = null
		names[1] = "Terry";
		names[2] = "Jason";
		System.out.println(names[1]);
		System.out.println(names[2]);
		boolean[] flags = new boolean[5];
		System.out.println(flags[1]); // default all elements = false
		
		
	}

}
