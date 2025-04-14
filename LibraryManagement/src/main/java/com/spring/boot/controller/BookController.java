package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.entity.Book;
import com.spring.boot.service.BookDeleteService;
import com.spring.boot.service.BookService;
import com.spring.boot.service.BookUpdateService;
import com.spring.boot.service.BookViewService;

@Controller
public class BookController {
	@Autowired
	private BookService bookservice;
	
	 @Autowired
	private BookUpdateService bookUpdateService;
	 
	 @Autowired
	private BookDeleteService bookDeleteService; 
	 
	 @Autowired
	    private BookViewService bookViewService;
	 
	
	@RequestMapping("/addbook")
	public ModelAndView addbook(@RequestParam("title") String title,@RequestParam("author") String author,@RequestParam("genre") String genre,@RequestParam("isbn") String isbn,@RequestParam("quantity") int quantity,@RequestParam("book_condition") String book_condition)
	{
		Book book = new Book();
		book.setAuthor(author);
		book.setGenre(genre);
		book.setCondition(book_condition);
		book.setIsbn(isbn);
		book.setTitle(title);
		book.setQuantity(quantity);
		bookservice.addbook(book);
		return new ModelAndView("bookmanagement.jsp");
	}
	
	@RequestMapping("/updatebook")
    public ModelAndView updateBook(@RequestParam("isbn") String isbn,@RequestParam(value = "new_condition") String newCondition,@RequestParam(value = "new_quantity") int newQuantity) {


        bookUpdateService.updateBook(isbn, newCondition, newQuantity);
        return new ModelAndView("bookmanagement.jsp");
    }
	
	@RequestMapping("/deletebook")
	public ModelAndView deletebook(@RequestParam("isbn") String isbn)
	{
		
		bookDeleteService.deletebook(isbn);
		return new ModelAndView("bookmanagement.jsp");
	}
	
	

    @RequestMapping("/viewbooks")
    public ModelAndView viewAllBooks() {
        List<Book> books = bookViewService.getAllBooks();
        return new ModelAndView("viewbooks.jsp", "books", books);
    }
}
