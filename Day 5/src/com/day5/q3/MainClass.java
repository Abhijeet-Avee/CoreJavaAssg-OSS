package com.day5.q3;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		Book b1 = new Book("Java in depth","yash","123",200.00);
		books.add(b1);
		Book b2 = new Book("Let us C","abhi","234",300.00);
		books.add(b2);
		Book b3 = new Book("HeadFirst Java","jeet","456",120.00);
		books.add(b3);
	
		BookCollection collection = new BookCollection("Abhijeet",books);
		
		System.out.println(collection.hasBook(b1));
		collection.sort();
	}
}
