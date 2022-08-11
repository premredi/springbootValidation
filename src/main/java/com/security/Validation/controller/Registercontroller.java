package com.security.Validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.security.Validation.Empservice.Empservice;
import com.security.Validation.Entity.Employee;

@Controller
public class Registercontroller {
	
	
	@Autowired
	Empservice service;
	
	@Autowired
	JavaMailSender mailsender;
	
	@GetMapping("/show")
	public String showpage(Model model) {
		return "index";
		
	}
	@GetMapping("/registration_form")
	public String viewregister(Model model) {
		Employee emp=new Employee();
		model.addAttribute("employee", emp);
		return "registration_form";
	}
	@PostMapping("/save")
	public String saveform(@ModelAttribute("employ") @Validated Employee employ, 
			BindingResult bindingresult,Model model) {
		if(bindingresult.hasErrors()) {
			return "registration_form";
		}
		model.addAttribute("employee", employ);
		service.saveemp(employ);
		return "display";
	}

}
