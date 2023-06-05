package com.vinternship.rabib.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinternship.rabib.app.model.Author;

public interface AuthorRepository extends JpaRepository<Author,Long> {
	

}
