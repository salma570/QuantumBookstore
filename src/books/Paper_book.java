package books;

import exceptions.NotEnoughbooksinStockException;

public class Paper_book extends Book{
	int stock;

	public Paper_book(String iSBN, String title, int yearOfPublishing, double price) {
		super(iSBN, title, yearOfPublishing, price);
		this.booktype = BookType.PAPERBOOK;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Paper_book(String iSBN, String title, int yearOfPublishing, double price,int stock) {
		this(iSBN, title, yearOfPublishing, price);
		this.stock = stock;
	}

	@Override
	public void checkandsend(int quantity, String email_address) throws NotEnoughbooksinStockException {
		if(this.stock< quantity) {
			throw new NotEnoughbooksinStockException("Not Enough books in Store");
		}
		this.stock = this.stock-quantity;
		System.out.println("shipping in progress");
	}
}
