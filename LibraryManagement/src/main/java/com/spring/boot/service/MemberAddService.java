package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Members;

@Service
public class MemberAddService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void addNewMember(Members member)
	{
		String SQL = "insert into members (member_name,member_mobile) values (?,?)";
		jdbcTemplate.update(SQL, new Object[] {member.getMember_name(),member.getMember_mobile()});
	}
}
