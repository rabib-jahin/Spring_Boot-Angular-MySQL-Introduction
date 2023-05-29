package com.vinternship.rabib.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinternship.rabib.app.model.Book;
import com.vinternship.rabib.app.model.BookShop;

public interface BookShopRepository extends JpaRepository<BookShop,Long> {
	
	
	List<BookShop> findByShopName(String title);

}
