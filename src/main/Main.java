package main;

import books.EBook;
import books.Paper_book;
import books.Showcase;
import inventory.Inventory;

public class Main {
	public static void main(String[] args) {
//		testcase1(); 	// add books to inventory 
//		testcase2();	// Remove Out dated books
//
//		testcase6();	// buying valid paper book
//		testcase7();	// buying valid E-book 
//
		// testing exceptions
//
//		testcase3();	// buy out of stock book
//		testcase4();	// buy book that doesn't exist
//		testcase5();	// buy a showCase book

	}
	public static void testcase1() {
		Inventory inventory = new Inventory();
		inventory.addBook(new Paper_book("123", "Java Basics", 2020, 50.0, 10));
		inventory.addBook(new EBook("456", "Life of Hemingway", 2022, 35));
		inventory.addBook(new Showcase("789", "History of Books", 2018, 20));
		System.out.println(inventory);
	}
	public static void testcase2() {
		Inventory inventory = new Inventory() ;
		inventory.addBook(new Paper_book("123", "Java Basics", 2020, 50.0, 10));
		inventory.addBook(new EBook("456", "Life of Hemingway", 2022, 35));
		inventory.addBook(new Showcase("789", "History of Books", 2018, 20));
		inventory.addBook(new Showcase("999", "Outdatedbook", 2000, 20));

		System.out.println("Before: ");
		System.out.println(inventory);

		inventory.removeOldBooks(5);
		System.out.println("After: ");
		System.out.println(inventory);
	}
	public static void testcase3() {
		Inventory inventory = Inventory.StockInventory();
		try {
			inventory.buy("123", 100, "myemail@gmail.com");
		} catch (Exception e) {
			System.out.println("Expected error: (buy out of stock book) " + e.getMessage());
		}
	}
	public static void testcase4() {
		Inventory inventory = Inventory.StockInventory();
		try {
			inventory.buy("1111111", 1, "myemail@gmail.com");
		} catch (Exception e) {
			System.out.println("Expected error: (buy book that doesn't exist) " + e.getMessage());
		}
	}
	public static void testcase5() {
		Inventory inventory = Inventory.StockInventory();
		try {
			inventory.buy("789", 1, "myemail@gmail.com");
		} catch (Exception e) {
			System.out.println("Expected error: (buy a showCase book)" + e.getMessage());
		}
	}
	public static void testcase6() {
		Inventory inventory = Inventory.StockInventory();
		try {
			inventory.buy("123", 1, "myemail@gmail.com");
		} catch (Exception e) {
			System.out.println("Expected error: (none)" + e.getMessage());
		}
	}
	public static void testcase7() {
		Inventory inventory = Inventory.StockInventory();
		try {
			inventory.buy("456", 1, "myemail@gmail.com");
		} catch (Exception e) {
			System.out.println("Expected error: (none)" + e.getMessage());
		}
	}
}
