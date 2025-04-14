package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.BorrowRecord;

@Service
public class BorrowService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void borrowBook(String member_mobile, String isbn, String borrowDate, String dueDate) {
        String SQL = "INSERT INTO borrow_records (member_mobile, isbn, borrow_date, due_date, status) VALUES (?, ?, ?, ?, 'borrowed')";
        jdbcTemplate.update(SQL, member_mobile, isbn, borrowDate, dueDate);
        
        String genreQuery = "SELECT genre FROM books WHERE isbn = ?";
        String genre = jdbcTemplate.queryForObject(genreQuery, new Object[]{isbn}, String.class);

        
        String updateReportSQL = "UPDATE reporting SET count = count + 1 WHERE genre = ?";
        jdbcTemplate.update(updateReportSQL, genre);
    }

    public List<BorrowRecord> viewAllBorrows() 
    {
        String sql = "SELECT br.borrow_id, m.member_name, br.member_mobile, b.title, br.isbn, br.borrow_date, br.due_date, br.status " +
                     "FROM borrow_records br " +
                     "JOIN members m ON br.member_mobile = m.member_mobile " +
                     "JOIN books b ON br.isbn = b.isbn " +
                     "WHERE br.status = 'borrowed'";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(BorrowRecord.class));
    }
    
    public void returnBook(String member_mobile,String isbn)
    {
    	String SQL="UPDATE borrow_records SET status = 'returned', due_date = CURRENT_DATE() WHERE member_mobile = ? AND isbn = ? AND status = 'borrowed'";
    	jdbcTemplate.update(SQL, member_mobile, isbn);
    }
    
    public List<BorrowRecord> viewreturnedbooks() 
    {
        String sql = "SELECT br.borrow_id, m.member_name, br.member_mobile, b.title, br.isbn, br.borrow_date, br.due_date, br.status " +
                     "FROM borrow_records br " +
                     "JOIN members m ON br.member_mobile = m.member_mobile " +
                     "JOIN books b ON br.isbn = b.isbn " +
                     "WHERE br.status = 'returned'";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(BorrowRecord.class));
    }
    
    public List<BorrowRecord> viewOverdue() 
    {
    	String SQL = "UPDATE borrow_records"
    			+ " SET status = 'overdue'"
    			+ " WHERE due_date < CURDATE()";
    	jdbcTemplate.update(SQL);
    	
        String sql = "SELECT br.borrow_id, m.member_name, br.member_mobile, b.title, br.isbn, br.borrow_date, br.due_date, br.status " +
                     "FROM borrow_records br " +
                     "JOIN members m ON br.member_mobile = m.member_mobile " +
                     "JOIN books b ON br.isbn = b.isbn " +
                     "WHERE br.status = 'overdue'";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(BorrowRecord.class));
    }
    
}

