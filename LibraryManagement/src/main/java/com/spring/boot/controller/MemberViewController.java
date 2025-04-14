package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.entity.Members;
import com.spring.boot.service.MemberViewService;

@Controller
public class MemberViewController {

	@Autowired
	private MemberViewService memberViewService;
	@RequestMapping("/viewmembers")
	public ModelAndView viewmembers()
	{
		List<Members> memberList = memberViewService.getAllMembers();
		return new ModelAndView("viewmembers.jsp","members",memberList);
	}
}
