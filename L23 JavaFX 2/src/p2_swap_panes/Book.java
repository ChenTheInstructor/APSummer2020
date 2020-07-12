package p2_swap_panes;

public class Book {

	private String title;
	private String isbn;
	private String author;
	private double price;
	public Book(String title, String isbn, String author, double price) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
}
