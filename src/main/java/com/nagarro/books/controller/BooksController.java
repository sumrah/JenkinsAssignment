package com.nagarro.books.controller;

import java.util.List;

import com.nagarro.books.Services.BookService;
import com.nagarro.books.exceptionhandling.ResourceNotFoundException;
import com.nagarro.books.model.BookModel;
import com.nagarro.books.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/Books")
public class BooksController {

	@Autowired
	private BookService bookService;

	@Autowired
	private BookRepository bookrepository;

	@GetMapping
	public List<BookModel> getAllBooks() {
		return bookrepository.findAll();
	}

	// build create Book REST API
	@PostMapping
	public BookModel createBook(@RequestBody BookModel Book) {
		return bookrepository.save(Book);
	}

	// build get Book by id REST API
	@GetMapping("{bookCode}")
	public ResponseEntity<BookModel> getBookById(@PathVariable Long bookCode) {
		BookModel Book = bookrepository.findById(bookCode)
				.orElseThrow(() -> new ResourceNotFoundException("Book not exist with id:" + bookCode));
		return ResponseEntity.ok(Book);
	}

	// build update Book REST API
	@PutMapping("{bookCode}")
	public ResponseEntity<BookModel> updateBook(@PathVariable Long bookCode, @RequestBody BookModel BookDetails) {
		BookModel updateBook = bookrepository.findById(bookCode)
				.orElseThrow(() -> new ResourceNotFoundException("Book not exist with id: " + bookCode));

		updateBook.setBookName(BookDetails.getBookName());
		updateBook.setAuthorName(BookDetails.getAuthorName());
		updateBook.setDateAdded(BookDetails.getDateAdded());

		bookrepository.save(updateBook);

		return ResponseEntity.ok(updateBook);
	}

	// build delete Book REST API
	@DeleteMapping("{bookCode}")
	public ResponseEntity<HttpStatus> deleteBook(@PathVariable Long bookCode) {

		BookModel Book = bookrepository.findById(bookCode)
				.orElseThrow(() -> new ResourceNotFoundException("Book not exist with id: " + bookCode));

		bookrepository.delete(Book);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}

}
