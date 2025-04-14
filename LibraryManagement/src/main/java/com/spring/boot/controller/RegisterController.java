package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.entity.Register;
import com.spring.boot.service.RegisterService;

@Controller
public class RegisterController {
@Autowired
private RegisterService registerService;
@RequestMapping("/addUser")
public ModelAndView addUser(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("name") String name)
{
	Register reg = new Register();
	reg.setName(name);
	reg.setPassword(password);
	reg.setUsername(username);
	registerService.addNewUser(reg);
	return new ModelAndView("login.jsp");
	
}

}
