package p3;

import java.io.IOException;

// custom exception class
public class IncorrectZipException extends IOException {
	
	public IncorrectZipException(String message) {
		super(message);
	}
	
	public IncorrectZipException() {
		super("The zip entered is incorrect!");
	}
}
