package com.day2.q2;

public class Book {
	private String bookTitle;
	private String author;
	private String isbn;
	int numOfCopies;

	public Book(String title, String author, String isbn, int numOfCopies) {
		this.bookTitle = title;
		this.author = author;
		this.isbn = isbn;
		this.numOfCopies = numOfCopies;
	}	
	public int getNumOfCopies() {
		return numOfCopies;
	}
	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void displayBookDetails() {
		System.out.println("Title: "+ bookTitle);
		System.out.println("ISBN: "+ isbn);
		System.out.println("Author: "+author);
		System.out.println("Available Copies: "+numOfCopies);
	}
}