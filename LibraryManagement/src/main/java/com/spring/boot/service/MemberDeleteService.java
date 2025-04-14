package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Members;

@Service
public class MemberDeleteService {
@Autowired
JdbcTemplate jdbcTemplate;
public void deletemember(Members member)
{
	String SQL = "DELETE FROM members WHERE member_name = ? AND member_mobile = ?";
	 jdbcTemplate.update(SQL, member.getMember_name(), member.getMember_mobile());
}
}
