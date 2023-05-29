package com.vinternship.rabib.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinternship.rabib.app.model.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
	
	List<Book> findByTitle(String title);

}
