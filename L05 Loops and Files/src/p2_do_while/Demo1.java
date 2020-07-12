package p2_do_while;

public class Demo1 {

	public static void main(String[] args) {
		int count = 0;

		do { 
			System.out.println("John Doe");
			count++;
		} while (count < 5); // post-test

		System.out.println("Done");
	}

}
