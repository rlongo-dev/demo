package com.example.demo.dto;


public class Book {
	private int bookId;
	private String bookName;
	private String author;

	public Book(int bookID, String bookName, String author) {
		super();
		this.bookId = bookID;
		this.bookName = bookName;
		this.author = author;
	}
	public int getBookID() {
		return bookId;
	}
	public void setBookID(int bookID) {
		this.bookId = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [bookID=" + bookId + ", bookName=" + bookName
				+ ", author=" + author + "]";
	}
	
}
