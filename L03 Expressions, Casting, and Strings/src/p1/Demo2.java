package p1;

import java.text.DecimalFormat;

public class Demo2 {

	public static void main(String[] args) {
		int a = 25000;
		double b = 13.7;
		double c = 4.8;
		
		double d = (a+b)/c;
		double e = a + b/c;
		
		DecimalFormat format1 = new DecimalFormat("0,000.00");
		System.out.print(format1.format(d));
		System.out.print("\t");
		System.out.print(format1.format(e));
		System.out.print("\t");
		System.out.print(format1.format(10000000.0000000));
	}

}
