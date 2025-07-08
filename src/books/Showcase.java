package books;

import exceptions.bookNotforsaleException;

public class Showcase extends Book{

	public Showcase(String iSBN, String title, int yearOfPublishing, double price) {
		super(iSBN, title, yearOfPublishing, price);
		this.booktype = BookType.SHOWCASE;
	}

	@Override
	public void checkandsend(int quantity, String email_address) throws bookNotforsaleException {
		throw new bookNotforsaleException("This book is Not for sale !!");
	}

}
