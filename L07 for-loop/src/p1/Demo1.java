package p1;

public class Demo1 {

	public static void main(String[] args) {
		for(int i= 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n---------------------");
		
		for(int i= 9; i > -1; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\n---------------------");
		
		for(int i = 1; i < 5; i++) { // nested for-loop
			for(int j = 1; j < 9; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}

}
