package com.wiley.sbconcept.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.sbconcept.exception.BookNOTFoundException;
import com.wiley.sbconcept.exception.DepNOTFoundException;
import com.wiley.sbconcept.model.Book;
import com.wiley.sbconcept.model.Department;
import com.wiley.sbconcept.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepo bookRepo;

	
	@Override
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBooksList() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public Book getBookById(Long bookId) throws BookNOTFoundException {
		// TODO Auto-generated method stub
		Optional<Book> book= bookRepo.findById(bookId);
		if(!book.isPresent()) {
			throw new BookNOTFoundException("Wiley book not available with the id you are searching for");
		}
		
		return book.get();
	}

}
