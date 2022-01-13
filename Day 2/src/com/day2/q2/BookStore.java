package com.day2.q2;

public class BookStore {
	private Book books[];
	private int counter;

	public BookStore() {
		books = new Book[10];
		counter = 0;
	}
	
	public int getCounter() {
		return counter;
	}

	public void sell(String title, int noOfCopies) {
		if (counter > 0) {
			for (int i=0; i<counter; i++) {
				if (title.equalsIgnoreCase(books[i].getBookTitle()) && books[i].getNumOfCopies() >= 1) {
					System.out.println("Book sold!! ");
					System.out.println("Title: " + books[i].getBookTitle());
					books[i].setNumOfCopies(books[i].getNumOfCopies() - noOfCopies);
				} else
					System.out.println("OUT OF STOCK!!");
			}
		} else {
			System.out.println("******** Book Sotre Empty ******");
		}
	}

	public void addBook(String title, String author, String isbn, int noOfCopies) {
		Book newBook = new Book(title, author, isbn, noOfCopies);
		if (counter < 10) {
			books[counter] = newBook;
			counter++;
		} else
			System.out.println("BookStore Capacity Full, Cannot add more!!");
	}

	public void order(String title, String author, String isbn, int noOfCopies) {
		if (counter > 0) {
			for (int i=0; i<counter;i++) {
				if (isbn.equalsIgnoreCase(books[i].getIsbn())) {
					books[i].setNumOfCopies(books[i].getNumOfCopies() + noOfCopies);
					System.out.println("Stock Updated for book: " + books[i].getBookTitle());
					System.out.println("Available Copies: " + books[i].getNumOfCopies());
				} else {
					addBook(title, author, isbn, noOfCopies);
				}
			}
		} else {
			addBook(title, author, isbn, noOfCopies);
		}
	}

	public void displayBookStoreContent() {
		System.out.println(">>>>>>Book Store Details<<<<");
		if (counter == 0)
			System.out.println("-------EMPTY-------");
		else {
			for (int i=0; i<counter; i++) {
				//System.out.println("BOOK STORE SIZE: " + counter);
				System.out.println("****************");
				books[i].displayBookDetails();
			}
		}
	}
}