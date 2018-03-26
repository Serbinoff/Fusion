package com.example.Fusion;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller  
@EnableWebSecurity
@RequestMapping(path="/") 
public class MainController {
	
	 @GetMapping("/")
	 public String home() {
	    return "home";
	 }
	 
	 @PostMapping("/")
	 public String homePage() {
	    return "home";
	 }
	 
	 @GetMapping("/login")
	 public String loginPage() {
	    return "login";
	 }
	 
	 @GetMapping("/logoutSuccessful")
		 public String logout() {
		 	return "logoutSuccessfulPage";
	 	}
}
