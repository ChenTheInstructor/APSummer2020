package p1_text_files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo2 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("textFile1.txt");
		pw.print("\u4eba");
		System.out.println("\u4eba");
		pw.close();
		
	
	}

}
