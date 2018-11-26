package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.model.User;
import com.ssm.service.impl.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping("/user")
	public String user(Model model){
		
		User user = userServiceImpl.selectById(1);
		model.addAttribute("user", user);
		
		return "user";
	}
}
