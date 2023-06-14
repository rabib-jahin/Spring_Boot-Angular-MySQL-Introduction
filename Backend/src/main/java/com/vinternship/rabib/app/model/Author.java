package com.vinternship.rabib.app.model;


import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;


@Entity
public class Author {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="author_id")
	private long authorId;
	private String firstName;
	private String lastName;
	private String language;
	@JsonIgnore
	@ManyToMany(mappedBy="authors",cascade= {
			
			
			CascadeType.MERGE
			
	}
	)
    private Set<Book> books=new HashSet<>();
	public Author() {}
	
	



	public Author(long authorId, String firstName, String lastName, String language, Set<Book> books) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.language = language;
		this.books = books;
	}



	public Author( String firstName, String lastName, String language, Set<Book> books) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.language = language;
		this.books = books;
	}



	public long getAuthorId() {
		return authorId;
	}



	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}





	





	public Set<Book> getBooks() {
		return books;
	}





	public void setBooks(Set<Book> books) {
		this.books = books;
	}





	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + firstName + ", lastName=" + lastName + ", language="
				+ language + ", books=" + books + "]";
	}




	
	

}