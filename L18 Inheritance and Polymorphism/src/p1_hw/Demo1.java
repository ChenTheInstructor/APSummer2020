package p1_hw;

import java.text.DecimalFormat;

public class Demo1 {

	public static void main(String[] args) {
		double randomPrice = Math.random() * 200;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(randomPrice));
		String priceStr = df.format(randomPrice);
		double price = Double.parseDouble(priceStr) ;
		System.out.println(price);
//		System.out.println(String.format("%10.2f",price));
	}

}
