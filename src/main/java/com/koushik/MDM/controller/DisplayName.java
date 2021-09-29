package com.koushik.MDM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/display")
public class DisplayName {
	@RequestMapping("/showName")
	public String showName() {
		return "hello";
	}

}