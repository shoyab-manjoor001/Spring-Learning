package com.api.book.bootrestbook.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.modals.Book;
import com.api.book.bootrestbook.services.BookService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/books")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	// Getting all books at a time.... Read Operation
	
	 @RequestMapping(method = RequestMethod.GET)
	    public ResponseEntity<Object> getBooks() 
	    {
		 	Iterable<Book> books = bookService.getBooks();
	        if(books==null)
	        {
	        	return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	        }
			return ResponseEntity.of(Optional.of(books));
	    }

	 // Getting single book at a time..... Read Opertation..
        
    @GetMapping("/{id}")
    public ResponseEntity<Object> getBook(@PathVariable int id) {
    	Optional<Book> book = bookService.getBook(id);
    	if(book.isEmpty())
    	{
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}
    	return ResponseEntity.of(Optional.of(book));
    }
    
    // Adding a Single Book at a time... Create Operation... 
    
    @PostMapping
    public void addBook(@RequestBody Book book)
    {
    	bookService.createOrUpdateBook(book);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book book)
    {
    	Optional<Book> existingBook =  bookService.getBook(id);
    	if(existingBook.isPresent())
    	{
    		book.setBookId(id);
    		Book updatedBook = bookService.createOrUpdateBook(book);
    		return ResponseEntity.ok(updatedBook);
    	}
		return ResponseEntity.notFound().build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id)
    {
    	Optional<Book> existingBook =  bookService.getBook(id);
    	if(existingBook.isPresent())
    	{
    		bookService.deleteBook(id);
    		return ResponseEntity.noContent().build();
    	}
    	else
    	{
    		return ResponseEntity.notFound().build();
    	}
    	
    }
    
//    @GetMapping("/author/{name}")
//    public ResponseEntity<List<Book>> getAuthorBooks(@PathVariable String name)
//    {
//    	List<Book> books = bookService.getBookByAuthor(name);
//    	if(books.isEmpty())
//    	{
//    		return ResponseEntity.notFound().build();
//    	}
//    	
//    	return ResponseEntity.ok(books);
//    	
//    }
    
    
    @GetMapping("/book/{name}")
    public ResponseEntity<List<Book>> getBooksName(@PathVariable String name)
    {
    	List<Book> books = bookService.getBooksByName(name);
    	if(books.isEmpty())
    	{
    		return ResponseEntity.notFound().build();
    	}
		return ResponseEntity.ok(books);
    	
    }
    // Notes
    
//  @RequestMapping(value = "/books", method = RequestMethod.GET)
//  public Iterable<Book> getBooks() 
//  {
//      return bookService.getBooks();
//  }
    
//  @GetMapping("/{id}")
//  public Optional<Book> getBook(@PathVariable int id) {
//  	return bookService.getBook(id);
//  }
    
    
}
