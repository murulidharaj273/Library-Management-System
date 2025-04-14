package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Register;

@Service
public class RegisterService {
@Autowired
private JdbcTemplate jdbcTemplate;
public void addNewUser(Register reg)
{
	String SQL = "insert into login values (?,?,?)";
	jdbcTemplate.update(SQL,new Object[] {reg.getUsername(),reg.getPassword(),reg.getName()});
}
}
