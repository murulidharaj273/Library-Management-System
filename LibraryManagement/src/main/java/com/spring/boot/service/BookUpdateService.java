package com.spring.boot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookUpdateService {

	 @Autowired
	   private JdbcTemplate jdbcTemplate;	
	 public void updateBook(String isbn, String newCondition, Integer newQuantity) {
		    
		        String sql = "UPDATE books SET book_condition = ?, quantity = ? WHERE isbn = ?";
		        jdbcTemplate.update(sql, newCondition, newQuantity, isbn);
		  
		}

	
}
