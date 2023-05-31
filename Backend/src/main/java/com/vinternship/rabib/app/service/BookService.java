package com.vinternship.rabib.app.service;

import java.util.List;

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
	
	public List<Book> getBooks(){
		
		
		
		return repository.findAll();
	}
	
public Book getBookById(long id){
		
		
		
		return repository.findById(id).orElse(null);
	}
public List<Book> getBookByTitle(String title){
	
	
	
	return repository.findByTitle(title);
}

public void delBookById(long id){
	

	
	
	 repository.deleteById(id);
	 
	 
}
public void delBooks(){
	

	
	
	 repository.deleteAll();
	 
	 
}
}
