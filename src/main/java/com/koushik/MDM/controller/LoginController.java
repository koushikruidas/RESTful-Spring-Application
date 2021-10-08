package com.koushik.MDM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/fancy-login")
	public String login() {
		return "fancy-login";
	}
}
