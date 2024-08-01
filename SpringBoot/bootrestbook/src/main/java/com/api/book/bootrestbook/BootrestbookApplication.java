package com.api.book.bootrestbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootrestbookApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =  SpringApplication.run(BootrestbookApplication.class, args);
//		Book b =  context.getBean(Book.class);
//		BookService bookService = context.getBean(BookService.class);
//		b.setBookId(1);
//		b.setBookName("Java Complete Reference");
//		b.setAuthor("ABC");
//		bookService.addBook(b);
	}

}
