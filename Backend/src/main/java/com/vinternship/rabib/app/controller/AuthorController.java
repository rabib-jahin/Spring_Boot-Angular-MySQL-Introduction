package com.vinternship.rabib.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinternship.rabib.app.model.Author;
import com.vinternship.rabib.app.service.AuthorService;
import com.vinternship.rabib.app.service.BookService;

@CrossOrigin(origins = "*")
@RestController

public class AuthorController {
	
	@Autowired
	private AuthorService service;
	
	@GetMapping("/api/authors")
	public List<Author> findAllAuthors(){
		
		
		return service.getAuthors();
		
		

}
}