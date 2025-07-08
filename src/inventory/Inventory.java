package inventory;

import java.util.ArrayList;

import books.Book;
import books.EBook;
import books.Paper_book;
import books.Showcase;
import exceptions.BooknotfoundException;

public class Inventory {
	ArrayList<Book> mybooks = new ArrayList<>();

	public void addBook(Book book) {
		mybooks.add(book);
	}

	public ArrayList<Book> removeOldBooks(int maxyear) {
		ArrayList<Book> oldBooks = new ArrayList<>();

		int currentYear = java.time.Year.now().getValue();
		int diffrence = 0;
		for (int i = 0; i < mybooks.size(); i++) {
			diffrence = currentYear - mybooks.get(i).getYearOfPublishing();
			if(diffrence >maxyear) {
				oldBooks.add(mybooks.get(i));
				mybooks.remove(i);
			}
		}
		return oldBooks;
	}

	public Book getBookByISBN(String isbn) {
		for (Book mybook : mybooks) {
			if (mybook.getISBN().equals(isbn)) {
				return mybook;
			}
		}
		return null;
	}

	public double buy(String ISBN, int quantity, String email_address)throws Exception{
		Book book = getBookByISBN(ISBN);

		if(book == null) {
			throw new BooknotfoundException("Sorry book not found");
		}else{
			book.checkandsend(quantity, email_address);
			mybooks.remove(book);
		}
		
		System.out.println("successful transaction: Paid Amount: "+ book.getPrice());
		return book.getPrice();
	}

	@Override
	public String toString() {
		String res =  "Inventory : \n";

		for (Book mybook : mybooks) {
			res+= mybook.toString()+"\n";
		}

		return res;
	}
	public static Inventory StockInventory(){
		Inventory inventory = new Inventory();

		inventory.addBook(new Paper_book("123", "Java Basics", 2020, 50.0, 10));
		inventory.addBook(new EBook("456", "Life of Hemingway", 2022, 35));
		inventory.addBook(new Showcase("789", "History of Books", 2018, 20));
		inventory.addBook(new Showcase("999", "Outdatedbook", 2000, 20));

		return inventory;
	}

}
