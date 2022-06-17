package com.nagarro.books.repository;

import com.nagarro.books.model.BookModel;

import org.springframework.data.jpa.repository.JpaRepository;



public interface BookRepository extends JpaRepository<BookModel,Long> {

	/*
	 * public List<BookModel> getBooks();
	 * 
	 * public BookModel getBook(Long bookCode);
	 * 
	 * public BookModel addBook(BookModel bmp);
	 * 
	 * public void deleteBook(BookModel bmp);
	 * 
	 * public void updateBook(BookModel bmp);
	 */

}
