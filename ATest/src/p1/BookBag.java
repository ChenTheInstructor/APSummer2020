package p1;

import java.util.function.Predicate;

public class BookBag {
	private Book[] bookArr;
	private int nElems;
	
	public BookBag(int maxSize) {
		bookArr = new Book[maxSize];
	}
	
	public void insert(Book book) {
		bookArr[nElems++] = book;
	}
	
	public Book search(Predicate<Book> predicate) {
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(bookArr[i])) {
				return bookArr[i];
			}
		} 
		return null;
	}
	
//	public Book searchById(String isbn) {
//		for(int i =0; i < nElems; i++) {
//			if(bookArr[i].getIsbn().contentEquals(isbn)) {
//				return bookArr[i];
//			}
//		}
//		return null;
//	}
//	
//	public Book searchByTitle(String title) {
//		for(int i =0; i < nElems; i++) {
//			if(bookArr[i].getTitle().contentEquals(title)) {
//				return bookArr[i];
//			}
//		}
//		return null;
//	}
//	
//	public Book SearchByTitleAndIsbn(String title, String isbn) {
//		for(int i =0; i < nElems; i++) {
//			if(bookArr[i].getTitle().equals(title) && bookArr[i].equals(isbn)) {
//				return bookArr[i];
//			}
//		}
//		return null;
//	}
//	
	
}
