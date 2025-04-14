package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Members;

@Service
public class MemberViewService {
@Autowired
private JdbcTemplate jdbcTemplate;

public List<Members> getAllMembers()
{
	String SQL = "select * from members";
	return jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Members.class));
}

}
