package com.koushik.MDM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/leaders")
public class LeadersController {
	@RequestMapping("home")
	public String showLeadershipDetails() {
		return "leader-ship-details";
	}
}
