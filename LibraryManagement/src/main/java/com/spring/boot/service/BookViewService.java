package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Book;

@Service
public class BookViewService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Book> getAllBooks() {
        String SQL = "SELECT book_id, title, author, genre, isbn, quantity, book_condition AS `condition` FROM books";
        return jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Book.class));
    }
}

