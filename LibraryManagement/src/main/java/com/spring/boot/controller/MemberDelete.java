package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.entity.Members;
import com.spring.boot.service.MemberDeleteService;

@Controller
public class MemberDelete {
	@Autowired
	private MemberDeleteService memberDeleteService;
	@RequestMapping("/deletemember")
	public ModelAndView deletemember(@RequestParam("member_name") String member_name,@RequestParam("member_mobile") String member_mobile)
	{
		Members member = new Members();
		member.setMember_name(member_name);
		member.setMember_mobile(member_mobile);
		memberDeleteService.deletemember(member);
		return new ModelAndView("membermanagement.jsp");
	}
}
