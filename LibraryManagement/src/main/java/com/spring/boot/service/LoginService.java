package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Login;

@Service
public class LoginService {
@Autowired
private JdbcTemplate jdbcTemplate;

public String verifyLoginDetails(Login log)
{
	try
	{
		String SQL = "select name from login where username = ? and password = ?";
		String  name = jdbcTemplate.queryForObject(SQL, new Object[]{log.getUsername(),log.getPassword()},String.class);
		return name;
	}
	catch (Exception e)
	{
		return null;
	}
}
}
