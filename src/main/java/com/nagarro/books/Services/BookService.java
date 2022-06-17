package com.nagarro.books.Services;

import java.util.List;

import com.nagarro.books.model.BookModel;

public interface BookService  {
	
	public List<BookModel> getAllBooks();
	
	//public BookModel addBook(BookModel book);

	public BookModel saveBook(BookModel book);
	
	public BookModel getBookById(Long bookCode);
	
	public BookModel updateBook(BookModel book);
	
	public void deleteBookById(Long bookCode);
	
}
	
	
//	
//	@Autowired
//	private BookRepository bookdao; 
//
//	public List<BookModel> getBooks() {
//		return bookdao.getBooks();
//	}
//
//	public BookModel getBook(int bookCode) {
//		return bookdao.getBook( bookCode);
//	}
//
//	public boolean uploadBook(BookModel bmp) {
//		bookdao.addBook(bmp);
//		return true;
//	}
//
//	public boolean updateBook(BookModel bmp) {
//		
//		bookdao.updateBook(bmp);
//		return true;
//	}
//
//	public boolean deleteBook(int bookCode) {
//		
//		BookModel bmp = getBook(bookCode);
//
//		if (bmp != null) {
//			bookdao.deleteBook(bmp);
//			return true;
//		} else {
//			return false;
//		}

	
	
//
//	@Autowired
//	private BookRepository bookRepo;
//	
//	public List<BookModel> getBookDetails(){
//		List<BookModel> bookList = bookRepo.findAll();
//		return bookList;
//	}
//	
//	public void insertBookDetail(BookModel book) {
//		bookRepo.save(book);
//	}
//	
//	public  Optional<BookModel> getBookById(int id){
//		return bookRepo.findById(id);
//	}
//	
//	public void deleteBookById(int id) {
//		bookRepo.deleteById(id);
//		
//	}
//	
//	public void updateBook(BookModel book) {
//		Optional<BookModel> obj=bookRepo.findById(book.getBookCode());
//		if(obj.isPresent()) {
//			BookModel result = obj.get();
//			result.setBookName(book.getBookName());
//			result.setAuthorName(book.getAuthorName());
//			result.setDateAdded(book.getDateAdded());
//			
//			bookRepo.save(result);
//			
//		}
//
