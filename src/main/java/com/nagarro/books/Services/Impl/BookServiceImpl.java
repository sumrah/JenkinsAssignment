package com.nagarro.books.Services.Impl;

import java.util.List;

import com.nagarro.books.Services.BookService;
import com.nagarro.books.model.BookModel;
import com.nagarro.books.repository.BookRepository;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public List<BookModel> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public BookModel saveBook(BookModel book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteBookById(Long bookCode) {
		bookRepository.deleteById(bookCode);
	}

	@Override
	public BookModel getBookById(Long bookCode) {

		return bookRepository.findById(bookCode).get();
	}

	@Override
	public BookModel updateBook(BookModel book) {

		return bookRepository.save(book);
	}

}
