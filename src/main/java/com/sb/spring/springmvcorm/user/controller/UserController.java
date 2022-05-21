package com.sb.spring.springmvcorm.user.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sb.spring.springmvcorm.user.entity.User;
import com.sb.spring.springmvcorm.user.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	@RequestMapping("registrationPage")
	public String showRegistrationPage() {
		// Returning just the view name as String not any model
		return "userReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result = service.save(user);
		model.addAttribute("result", "User created with Id"+result);
		return "userReg";
	}
}
