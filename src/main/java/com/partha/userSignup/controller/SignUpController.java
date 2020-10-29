package com.partha.userSignup.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.partha.userSignup.model.Role;
import com.partha.userSignup.model.User;
import com.partha.userSignup.model.UserRepository;

@Controller
public class SignUpController {
	
	@Autowired
	UserRepository userRepository;
	
  @RequestMapping(value="/signup",method =RequestMethod.GET )
	
	public String userSignUp(ModelMap model) {
		
		return "signUp";
		
	}
   @RequestMapping(value="/signup",method =RequestMethod.POST )

public String saveUserSignUp(@Valid @ModelAttribute("user")User user, 
	      BindingResult result,ModelMap model,RedirectAttributes redirectAttributes) {
	if (result.hasErrors()) {
        return "error";
    }
		
	
	user.setStatus(1);
	String username= user.getUsername();
	Role role = new Role();
	role.setId(2);	
	user.setRole(role);
	userRepository.save(user);
	redirectAttributes.addFlashAttribute("user", user);
	//return "welcome"; 
	return  "redirect:/userDetails"; 
	
}

	
	  @RequestMapping(value="/userDetails",method =RequestMethod.GET )
	  public String showUserDetails(ModelMap model,@ModelAttribute("user") User user) { 
		  //model.put("username", username);
	String username = user.getUsername(); 
	  model.put("user", user);
	  Optional<User> user1= userRepository.findUserByUsername(username);
	  System.out.println("username"+user1);
	  return "userDetails";
	  
	  }
	 
}
