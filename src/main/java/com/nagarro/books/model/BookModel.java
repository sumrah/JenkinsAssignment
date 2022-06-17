package com.nagarro.books.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name = "booksdata")
public class BookModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bookCode;
	
	private String bookName;
	private String authorName;
	private String dateAdded;
	
	
	public BookModel() {
	
	}

	public BookModel(Long bookCode, String bookName, String authorName, String dateAdded) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.authorName = authorName;
		this.dateAdded = dateAdded;
	}


	public Long getBookCode() {
		return bookCode;
	}


	public void setBookCode(Long bookCode) {
		this.bookCode = bookCode;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public String getDateAdded() {
		return dateAdded;
	}


	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}


	@Override
	public String toString() {
		return "BookModel [bookCode=" + bookCode + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", dateAdded=" + dateAdded + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
