package p2_binary_files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("binaryFile1.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		String sentence1 = "Hi Hi"; 
		String sentence2 = "Hello Hello"; 
		
		dos.writeUTF(sentence1);
		dos.writeUTF(sentence2);
		dos.close();
	}

}
