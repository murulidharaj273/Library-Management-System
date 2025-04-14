package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.entity.Login;
import com.spring.boot.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	@RequestMapping("/checklogin")
	public ModelAndView checklogin(@RequestParam("username") String username,@RequestParam("password") String password)
	{
		Login log = new Login();
		log.setUsername(username);
		log.setPassword(password);
		String name = loginService.verifyLoginDetails(log);
		
		if(name != null)
		{
			return new ModelAndView("success.jsp","name",name);
		}
		else
		{
			return new ModelAndView("failure.jsp");
		}
	}

}
