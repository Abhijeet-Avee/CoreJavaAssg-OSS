package com.bookapp.web.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.model.persistence.Book;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;

public class BookAppMain {
	public static void main(String[] args) {
		BookService bookservice = new BookServiceImpl();
		
		/**Add a new book record*/
		System.out.println("Adding book records");
		bookservice.addBook(new Book("1234","Java","Abhijeet",Date.valueOf("2022-01-29"),234.55));
		bookservice.addBook(new Book("3214","C#","Yash",Date.valueOf("2022-01-29"),434.55));
		bookservice.addBook(new Book("4213","C++","Abhi",Date.valueOf("2022-01-29"),134.55));
		
		/**Printing all books**/
		printBooks(bookservice);
		
		/**Updating Book record**/
		System.out.println("Updating book record");
		bookservice.updateBook(new Book("1234","JAVA","Avee",Date.valueOf("2022-01-30"),634.55));
		System.out.println(bookservice.getBookById(1));
		
		/**Deleting Book record**/
		System.out.println("Deleting book record");
		bookservice.removeBook(1);
		printBooks(bookservice);
		
	}

	private static void printBooks(BookService bookservice) {
		System.out.println("Printing all book records");
		List<Book> books = new ArrayList<>();
		books = bookservice.getAllBooks();
		for(Book book: books) {
			System.out.println(book);
		}
	}
}
