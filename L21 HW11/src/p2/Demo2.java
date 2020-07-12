package p2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Demo2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileOutputStream fos = new FileOutputStream("p2data.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		Random random = new Random();
		int numberOfDoubles = random.nextInt(10);
		for (int i = 0; i < numberOfDoubles; i++) {
			double randomDouble = Math.random() * 100;
			System.out.println(randomDouble);
			dos.writeDouble(randomDouble);
		}
		fos.close();
		dos.close();
		Thread.sleep(1000);
		System.out.println("Done writting! " + numberOfDoubles);

		
		FileInputStream fis = new FileInputStream("p2data.dat");
		DataInputStream dis = new DataInputStream(fis);

		try {
			while (true) {
				System.out.println(dis.readDouble());
			}
		} catch (EOFException e) {
			System.out.println("EOF");
		}

		dis.close();

	}

}
