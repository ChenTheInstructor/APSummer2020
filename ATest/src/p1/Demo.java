package p1;

import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		Book b1 = new Book("A", "A1");
		Book b2 = new Book("B", "A2");
		Book b3 = new Book("C", "A3");
		Book b4 = new Book("D", "A4");
		Book b5 = new Book("E", "A5");

		BookBag theBag = new BookBag(10);
		theBag.insert(b1);
		theBag.insert(b2);
		theBag.insert(b3);
		theBag.insert(b4);
		theBag.insert(b5);

		Book x = theBag.search((book) -> {
			if (book.getTitle().equals("C")) {
				return true;
			} else {
				return false;
			}
		});

		System.out.println(x);

		Book y = theBag.search((k) -> {
			if (k.getIsbn().contentEquals("A4")) {
				return true;
			} else {
				return false;
			}
		});

		System.out.println(y);
		
		showMessage("Hello!");
	}

	public static void showMessage(String message) {
		System.out.println(message);
	}
}
