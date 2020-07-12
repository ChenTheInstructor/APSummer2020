package p2_read_text_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("file1.txt");
		Scanner scan = new Scanner(file);
		
		
		String line;
		while (scan.hasNextLine()) {
			line = scan.nextLine();
			System.out.println(line);
		}
		
		
	}

}
