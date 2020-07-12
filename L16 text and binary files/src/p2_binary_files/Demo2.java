package p2_binary_files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("binaryFile1.dat");
		DataInputStream dis = new DataInputStream(fis);
		String str1 = dis.readUTF();
		System.out.println(str1);
		String str2 = dis.readUTF();
		System.out.println(str2);
		dis.close();
	}

}
