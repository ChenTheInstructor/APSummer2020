package p2_casting;

public class Demo1 {

	public static void main(String[] args) {
		int a = 25;
		double b = 13.7;
		double c = 4.8;
		
		double d = (a+b)/c;
		double e = a + b/c;
		System.out.println(d);
		System.out.println((int)d);
		System.out.println((double)a);
//		System.out.println((int)"88");
	}

}
