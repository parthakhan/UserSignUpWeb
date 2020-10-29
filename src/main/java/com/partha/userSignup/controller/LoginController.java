package com.partha.userSignup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@RequestMapping(value="/login",method =RequestMethod.GET )
	
	public String showLogin(ModelMap model) {
		
		return "login";
		
	}
	@RequestMapping(value ="/login", method = RequestMethod.POST)
public String afterLogin(ModelMap model, @RequestParam String username) {
		 model.put("username", username);
		return "welcome";
		
	}

}
