package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.web.service.LoginService;
@RestController
public class LoginController {
	@Autowired
	LoginService loginService;
	//Model
	@GetMapping(value = "/login")
	public String showLoginPage( ) {
		System.out.println("its working");
		//model.put("name", name);
		return "login"; 
		
	}
	
	@PostMapping(value = "/loginreq")
	public String showWelcomePage( ModelMap model, @RequestParam String name, @RequestParam String password) {
		System.out.println("its working");
		boolean isvalidUser = loginService.validateUser(name, password);
		if (isvalidUser) 
			return "login";
		model.put("name", name);
		model.put("password", password);
		return "welcome"; 
		
	}
} 