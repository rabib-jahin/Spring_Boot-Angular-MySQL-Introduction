package com.vinternship.rabib.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinternship.rabib.app.model.BookShop;
import com.vinternship.rabib.app.repository.BookShopRepository;

@Service
public class BookShopService {
	
	@Autowired
	private BookShopRepository repository;
    public List<BookShop> saveBookShops(List<BookShop> bookShop){
		
		
		
		return repository.saveAll(bookShop);
}
 public BookShop updateBookShop(BookShop bookShop,long id){
		
		
		bookShop.setShopNumber(id);
		
		
		return repository.save(bookShop);
	}
	
	public List<BookShop> getBookShops(){
		
		
		
		return repository.findAll();
	}
//	
public BookShop getBookShopById(long id){
		
		
		
		return repository.findById(id).orElse(null);
	}
public List<BookShop> getBookShopsByTitle(String title){
	
	
	
	return repository.findByShopName(title);
}

public void delBookShopById(long id){
	

	
	
	 repository.deleteById(id);
	 
	 
}
public void delBookShops(){
	

	
	
	 repository.deleteAll();
	 
	 
}
}
