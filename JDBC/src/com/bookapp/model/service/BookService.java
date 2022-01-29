package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.exceptions.BookNotFoundException;
import com.bookapp.model.exceptions.DataAccessException;
import com.bookapp.model.persistence.Book;

public interface BookService {
	public List<Book> getAllBooks() throws DataAccessException;
	public Book getBookById(int bookId) throws BookNotFoundException,DataAccessException;
	public void addBook(Book book) throws DataAccessException;
	public void updateBook(Book book) throws DataAccessException;
	public void removeBook(int bookId) throws DataAccessException;
}
