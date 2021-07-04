package org.aynama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrgController {
	
	@RequestMapping(value="welcome")
	public String getWelcome(){
		
		return "home";
		
	}

	@RequestMapping(value="signup")
	public String getRegisterPage(){
		
		return "register";
	}
	
	
	@RequestMapping(value="employees")
	public String getLisPaget(){
		
		return "list";
	}
}
