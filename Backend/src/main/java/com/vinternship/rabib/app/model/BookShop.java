package com.vinternship.rabib.app.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;


import jakarta.persistence.*;
@Entity

public class BookShop {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="book_shop_number")
	private long shopNumber;
	  @Column(name="shop_name")
	private String shopName;
	  @Column(name="location")
	private String location;

    @ManyToMany(mappedBy="bookShop",cascade = { CascadeType.MERGE})
	@JsonIgnore
	private Set<Book> book=new HashSet<>();
    @Column(name="contact_no")
	private String contactNo;
	private String email;
	
	public BookShop() {}
	
	public BookShop(long shopNumber, String shopName, String location, Set<Book> book,
			String contactNo, String email) {
		super();
		this.shopNumber = shopNumber;
		this.shopName = shopName;
		this.location = location;
		this.book = book;
		this.contactNo = contactNo;
		this.email = email;
	}
	public BookShop( String shopName, String location,Set<Book> book,
			String contactNo, String email) {
		super();
	
		this.shopName = shopName;
		this.location = location;
		this.book = book;
		this.contactNo = contactNo;
		this.email = email;
	}
	
	


	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}

	public long getShopNumber() {
		return shopNumber;
	}
	public void setShopNumber(long shopNumber) {
		this.shopNumber = shopNumber;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "BookShop [shopNumber=" + shopNumber + ", shopName=" + shopName + ", location=" + location + ", book="
				+ book + ", contactNo=" + contactNo + ", email=" + email + "]";
	}

	
	
	
}