package com.api.book.bootrestbook.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.api.book.bootrestbook.modals.Book;

@Service
public interface BookService {
	public Optional<Book> getBook(int bookId);
	public Iterable<Book> getBooks();
	public void deleteBook(int id);
	public Book createOrUpdateBook(Book book);	
	public List<Book> getBookByAuthor(String name);
	public List<Book> getBooksByName(String name);
}
