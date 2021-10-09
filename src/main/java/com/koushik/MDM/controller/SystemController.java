package com.koushik.MDM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/systems")
public class SystemController {

	@GetMapping("/home")
	public String sys() {
		return "admin-page";
	}
}
