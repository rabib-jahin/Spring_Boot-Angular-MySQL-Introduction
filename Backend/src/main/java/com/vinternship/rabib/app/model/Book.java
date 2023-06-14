package com.vinternship.rabib.app.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity


public class Book {
	
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="book_id")
	private long bookId;
	private String title;
	
	    private double price;
	    @Column(name="year_of_publish")
	    private int yearOfPublish;
	    private String genre;
	    private String publisher;
	    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	    private Set<Author> authors=new HashSet<>();
	    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	    private Set<BookShop> bookShop = new HashSet<>();
	    
	    // Constructors
	    public Book() {}
	    
	 

	  

		

	
	    public Book(long bookId, String title, double price, int yearOfPublish, String genre, String publisher,
				Set<Author> authors, Set<BookShop> bookShop) {
			super();
			this.bookId = bookId;
			this.title = title;
			this.price = price;
			this.yearOfPublish = yearOfPublish;
			this.genre = genre;
			this.publisher = publisher;
			this.authors = authors;
			this.bookShop = bookShop;
		}

	  
	    public Book( String title, double price, int yearOfPublish, String genre, String publisher,
				Set<Author> authors, Set<BookShop> bookShop) {
			super();
		
			this.title = title;
			this.price = price;
			this.yearOfPublish = yearOfPublish;
			this.genre = genre;
			this.publisher = publisher;
			this.authors = authors;
			this.bookShop = bookShop;
		}













		







		public Set<BookShop> getBookShop() {
			return bookShop;
		}








		public void setBookShop(Set<BookShop> bookShop) {
			this.bookShop = bookShop;
		}








		public void setAuthors(Set<Author> authors) {
			this.authors = authors;
		}








		public Set<Author> getAuthors() {
			return authors;
		}








		// Getter and setter methods
	    public String getTitle() {
	        return title;
	    }
	    
	    public long getBookId() {
			return bookId;
		}

		public void setBookId(long bookId) {
			this.bookId = bookId;
		}

		public void setTitle(String title) {
	        this.title = title;
	    }
	    
	    public double getPrice() {
	        return price;
	    }
	    
	    public void setPrice(double price) {
	        this.price = price;
	    }
	    
	    public int getYearOfPublish() {
	        return yearOfPublish;
	    }
	    
	    public void setYearOfPublish(int yearOfPublish) {
	        this.yearOfPublish = yearOfPublish;
	    }
	    
	    public String getGenre() {
	        return genre;
	    }
	    
	    public void setGenre(String genre) {
	        this.genre = genre;
	    }
	    
	    public String getPublisher() {
	        return publisher;
	    }
	    
	    public void setPublisher(String publisher) {
	        this.publisher = publisher;
	    }








		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + ", yearOfPublish="
					+ yearOfPublish + ", genre=" + genre + ", publisher=" + publisher + ", authors=" + authors
					+ ", bookShop=" + bookShop + "]";
		}








	

	    
	  
	    
	  

}
