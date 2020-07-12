
package p1;

import java.text.NumberFormat;
import java.util.Locale;

public class Demo1 {
	public static void main(String[] args) {
		
	
		NumberFormat format1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(format1.format(123.34343));
		System.out.println("\u00B0");
	}

}