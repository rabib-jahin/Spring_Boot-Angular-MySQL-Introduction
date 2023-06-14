package com.vinternship.rabib.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinternship.rabib.app.model.BookShop;
import com.vinternship.rabib.app.service.BookShopService;
@CrossOrigin(origins = "*")
@RestController
public class BookShopController {
	
	
	@Autowired
	private BookShopService service;
	
	@PutMapping("/api/bookshops/{id}")
	public BookShop updateBookShop(@PathVariable long id,@RequestBody BookShop bookShop){
		
		
		service.updateBookShop(bookShop,id);
		
		return bookShop;
	}
	@PostMapping("/api/bookshops")
	public List<BookShop> saveBookShops(@RequestBody List<BookShop> bookshop){
	
		
		 service.saveBookShops(bookshop);
		
		return bookshop;
	}
	
	@GetMapping("/api/bookshops")
	public List<BookShop> findAllBookShops(){
		
		
		return service.getBookShops();
		
		
	}
	@GetMapping("/api/bookshop/{id}")
	public BookShop findBookById(@PathVariable long id){
		System.out.print(id)
		;
		
		return service.getBookShopById(id);
		
		
	}
	@GetMapping("/api/bookshops/{title}")
	public List<BookShop> findBookShopsByTitle(@PathVariable String title){
		
		return service.getBookShopsByTitle(title);
		
		
	}
	@DeleteMapping("/api/bookshop/{id}")
	public String  deleteBookById(@PathVariable long id){
		
		 service.delBookShopById(id);
		
		 return "Successfully deleted the bookshop with id "+id;
		
	}
	
	@DeleteMapping("/api/bookshop")
	public String  deleteBookShops(){
		
		 service.delBookShops();
		
		 return "Successfully deleted all the bookshops";
		
	}
}
