package com.api.book.bootrestbook.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.modals.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	// adding new book (Create Operation..)
	@Override
	public Book createOrUpdateBook(Book book)
	{
		return bookRepository.save(book);
	}

	// getting all books at a time (Read Operation)
	@Override
	public Iterable<Book> getBooks() {
		return bookRepository.findAll();	
	}

	// getting a single book (Read Operation..)
	@Override
	public Optional<Book> getBook(int bookId) {
		return bookRepository.findById(bookId);
	}

	// deleting a single book (Delete Operation)
	@Override
	public void deleteBook(int bookId) {
		bookRepository.deleteById(bookId);
	}

//	@Override
//	public List<Book> getBookByAuthor(String name) {
//		return bookRepository.findByAuthor(name);
//	}

	@Override
	public  List<Book> getBooksByName(String name) {
		
		List<Book> books = bookRepository.findByBookName(name);
		return books;
	}
	
}
