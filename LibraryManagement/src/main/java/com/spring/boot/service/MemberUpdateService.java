package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Members;

@Service
public class MemberUpdateService {
	@Autowired
private JdbcTemplate jdbcTemplate;
	public void updatemember(Members member,String newmember_mobile)
	{
		String SQL = "UPDATE members SET member_mobile = ? WHERE member_name = ? AND member_mobile = ?";
		jdbcTemplate.update(SQL, new Object[] {newmember_mobile,member.getMember_name(),member.getMember_mobile()});
	}
	
}
