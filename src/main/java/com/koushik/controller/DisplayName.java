package com.koushik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/weatherApp")
public class DisplayName {
	@RequestMapping("/showName")
	public String showName() {
		return "hello";
	}

}