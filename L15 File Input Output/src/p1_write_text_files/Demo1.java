package p1_write_text_files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file2.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		pw.print("Hi");
		pw.println();
		pw.printf("%10s%10d%n", "Hi", 100);
		pw.close();
	}

}
