package p4_object_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoWriteObjects {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p1 = new Person("Jason", 14);
		Person p2 = new Person("Terry", 14);
		Person[] arr = {p1, p2};
		FileOutputStream fos = new FileOutputStream("object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(p1);
//		oos.writeObject(p2);
		oos.writeObject(arr);
		oos.close();
		
		File file = new File("object.dat");
		if(file.exists()) {
		FileInputStream fis = new FileInputStream("object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
//		Person jason = (Person)(ois.readObject());
//		Person terry = (Person)(ois.readObject());
		
		
		Person[] newArray = (Person[])(ois.readObject());
		System.out.println(newArray[1]);
		System.out.println(newArray[0]);
		ois.close();
		} else {
			System.out.println("File doesn't exist");
		}
		
	}

}
