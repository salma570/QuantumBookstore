package books;

public abstract class Book {
	String ISBN;
	String title;
	int yearOfPublishing;
	double price;
	BookType booktype;

	public Book(String iSBN, String title, int yearOfPublishing, double price) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.yearOfPublishing = yearOfPublishing;
		this.price = price;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public String getISBN() {
		return ISBN;
	}

	public BookType getBooktype() {
		return booktype;
	}

	protected void setBooktype(BookType booktype) {
		this.booktype = booktype;
	}

	public double getPrice() {
		return price;
	}
	public abstract void checkandsend(int quantity, String email_address) throws Exception;

	@Override
	public String toString() {
		return "Book [ISBN: " + ISBN + ", title: " + title + ", yearOfPublishing: " + yearOfPublishing + ", price: " + price
				+ ", booktype: " + booktype + "]";
	}
}
