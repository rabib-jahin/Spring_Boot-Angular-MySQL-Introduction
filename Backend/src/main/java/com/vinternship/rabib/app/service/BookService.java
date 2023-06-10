package com.vinternship.rabib.app.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinternship.rabib.app.model.Book;
import com.vinternship.rabib.app.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repository;
	

	
    public Book saveBook(Book book){
		
		
		
		return repository.save(book);
}
 public Book updateBook(Book book,long id){
		
	book.setBookId(id);
		
		
		return repository.save(book);
	}
	
	public Set<Book> getBooks(){
		
		Set<Book> set = new HashSet<>(repository.findAll());
		
		return set;
	}
	
public Book getBookById(long id){
		
		
		
		return repository.findById(id).orElse(null);
	}
public Set<Book> getBookByTitle(String title){
	
	
	
	Set<Book> set = new HashSet<>(repository.findByTitle(title));
	return set;
}

public void delBookById(long id){
	

	
	
	 repository.deleteById(id);
	 
	 
}
public void delBooks(){
	

	
	
	 repository.deleteAll();
	 
	 
}
}
