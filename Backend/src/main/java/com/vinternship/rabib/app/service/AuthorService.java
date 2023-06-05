package com.vinternship.rabib.app.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinternship.rabib.app.model.Author;
import com.vinternship.rabib.app.model.Book;
import com.vinternship.rabib.app.repository.AuthorRepository;
import com.vinternship.rabib.app.repository.BookRepository;

@Service

public class AuthorService {
	
	@Autowired
	private AuthorRepository repository;
public List<Author> getAuthors(){
		
		
		
		return repository.findAll();
	}
	

}
