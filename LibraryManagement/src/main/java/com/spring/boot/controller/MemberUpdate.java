package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.entity.Members;
import com.spring.boot.service.MemberUpdateService;

@Controller
public class MemberUpdate {
@Autowired
private MemberUpdateService memberUpdateService;
@RequestMapping("/updatemember")
public ModelAndView updatemember(@RequestParam("member_name") String member_name,@RequestParam("member_mobile") String member_mobile,@RequestParam("newmember_mobile") String newmember_mobile)
{
	Members member = new Members();
	member.setMember_mobile(member_mobile);
	member.setMember_name(member_name);
	memberUpdateService.updatemember(member,newmember_mobile);
	return new ModelAndView("membermanagement.jsp");
}
}
