package p3_practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("data.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(100);
		dos.writeDouble(100.1);
		dos.close();
		
		FileInputStream fis = new FileInputStream("data.dat");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readInt() + dis.readDouble());
		dis.close();
		
	}

}
