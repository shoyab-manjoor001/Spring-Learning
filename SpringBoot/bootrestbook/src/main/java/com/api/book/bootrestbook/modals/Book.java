package com.api.book.bootrestbook.modals;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	private String bookName;
	private String author;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}
	
	
}