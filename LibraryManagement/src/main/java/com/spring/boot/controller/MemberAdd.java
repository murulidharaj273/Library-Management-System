package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.entity.Login;
import com.spring.boot.entity.Members;
import com.spring.boot.service.LoginService;
import com.spring.boot.service.MemberAddService;
@Controller
public class MemberAdd {
	@Autowired
	private MemberAddService memberaddservice;
	@RequestMapping("/addmember")
	public ModelAndView addmember(@RequestParam("member_name") String member_name,@RequestParam("member_mobile") String member_mobile)
	{
		Members member = new Members();
		member.setMember_name(member_name);
		member.setMember_mobile(member_mobile);
		memberaddservice.addNewMember(member);
		return new ModelAndView("membermanagement.jsp");
		
		
	}
}
