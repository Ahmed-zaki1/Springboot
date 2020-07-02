package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Service

public class LoginService {
    public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("Zaki") && password.equals("Adnan");
    }
}
