package com.api.book.bootrestbook.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.book.bootrestbook.modals.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	
	public List<Book> findByAuthor(String name);
	public List<Book> findByBookName(String name);

}
