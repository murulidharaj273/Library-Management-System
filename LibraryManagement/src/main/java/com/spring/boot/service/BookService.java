package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Book;

@Service 
public class BookService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void addbook(Book book)
	{
		String SQL = "insert into books (title,author,genre,isbn,quantity,book_condition) values (?,?,?,?,?,?)";
		jdbcTemplate.update(SQL,new Object[] {book.getTitle(),book.getAuthor(),book.getGenre(),book.getIsbn(),book.getQuantity(),book.getCondition()});
	}
	
}
