package com.koushik.MDM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koushik.MDM.entity.Customer;
import com.koushik.MDM.services.CustomerService;

@Controller
@RequestMapping("/display")
public class DisplayList {
	@Autowired
	private CustomerService customerService;
	
	
	
	@RequestMapping("/showName")
	public String showName(Model model) {
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customerList", customers);
		return "show-customer-list";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(Model model) {
		Customer cust = new Customer();
		model.addAttribute("customer-details", cust);
		return "add-customer";
	}
	
	@RequestMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer-details") Customer customer,
			BindingResult theBindingResult) {
		customerService.saveCustomer(customer);
		return "redirect:/";
	}

}