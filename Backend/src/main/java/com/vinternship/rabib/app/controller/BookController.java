package com.vinternship.rabib.app.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinternship.rabib.app.model.Book;
import com.vinternship.rabib.app.service.BookService;
@CrossOrigin(origins = "*")
@RestController
public class BookController {
	
	
	@Autowired
	private BookService service;
	
	@PutMapping("/api/books/{id}")
	public Book updateBook(@PathVariable long id,@RequestBody Book book){
		System.out.print(book);
		
		service.updateBook(book,id);
		
		return book;
	}
	@PostMapping("/api/books")
	public Book saveBook(@RequestBody Book book){
		System.out.print(book);
		
		 service.saveBook(book);
		
		return book;
	}
	
	@GetMapping("/api/books")
	public Set<Book> findAllBooks(){
		
		
		return service.getBooks();
		
		
	}
	@GetMapping("/api/book/{id}")
	public Book findBookById(@PathVariable long id){
		System.out.print(id)
		;
		
		return service.getBookById(id);
		
		
	}
	@GetMapping("/api/books/{title}")
	public Set<Book> findBookByTitle(@PathVariable String title){
		
		return service.getBookByTitle(title);
		
		
	}
	@DeleteMapping("/api/book/{id}")
	public String  deleteBookById(@PathVariable long id){
		
		 service.delBookById(id);
		
		 return "Successfully deleted the book with id "+id;
		
	}
	
	@DeleteMapping("/api/book")
	public String  deleteBooks(){
		
		 service.delBooks();
		
		 return "Successfully deleted all the books";
		
	}
}
