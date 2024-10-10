package com.hibernatejsp;
import javax.persistence.*;
@Entity
public class Book {
	
	@Id
	private int bid;
	private String book_name;
	private int bookprice;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", book_name=" + book_name + ", bookprice=" + bookprice + "]";
	}
	public Book(int bid, String book_name, int bookprice) {
		super();
		this.bid = bid;
		this.book_name = book_name;
		this.bookprice = bookprice;
	}
	public Book() {
		super();
		
	}
	
	
	

}
