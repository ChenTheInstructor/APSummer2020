package p2_swap_panes;

public class BookBag {
	
	private Book[] bookArr;
	private int nElems;

	public BookBag(int maxSize) {
		bookArr = new Book[maxSize];
		nElems = 0;
	}

	public void insert(Book newBook) {
		bookArr[nElems++] = newBook;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(bookArr[i]);
		}
		System.out.println();
	}

}
