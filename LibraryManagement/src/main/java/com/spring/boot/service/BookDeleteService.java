package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookDeleteService {
  @Autowired
  private JdbcTemplate jdbcTemplate;
  
  public void deletebook(String isbn)
  {
	  String SQL="delete from books where isbn=?";
	  jdbcTemplate.update(SQL,isbn);
  }
}
