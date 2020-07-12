package p1;

import java.io.FileNotFoundException;

public class FileManagerDemo {

	public static void main(String[] args) throws FileNotFoundException {
		final int PASSWORD_LENGTH = 10;
		UserBag userBag = new UserBag(500);
		FileManager.fillUserBag(userBag, "First Names.txt", "Last Names.txt", PASSWORD_LENGTH);
		userBag.display();
	}

}

// data abstraction
