package com.wiley.sbconcept.service;

import java.util.List;

import com.wiley.sbconcept.exception.BookNOTFoundException;
import com.wiley.sbconcept.model.Book;


public interface BookService {

    public Book createBook( Book book);
	
	public List<Book> getAllBooksList();
	
	public Book getBookById(Long bookId) throws BookNOTFoundException;
	
}
