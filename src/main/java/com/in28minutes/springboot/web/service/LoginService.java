package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Component;

//Spring - Bean
@Component
public class LoginService {

	public boolean validateUser(String userid, String password) {
		
		if(userid.equalsIgnoreCase("Ahmed") && password.equalsIgnoreCase("zaki")) {	
			return true;
		}else {
			return false;
		}
		
		
	}
}
