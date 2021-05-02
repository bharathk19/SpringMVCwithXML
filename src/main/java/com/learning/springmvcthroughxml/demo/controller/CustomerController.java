package com.learning.springmvcthroughxml.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.springmvcthroughxml.demo.entity.Customer;

@RequestMapping("/Customer")
@Controller
public class CustomerController {

	
	
	@InitBinder
	public void initbinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor timmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, timmer);
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		
		theModel.addAttribute("customer", new Customer());
		
		return "customerForm";
	}
	
	@RequestMapping("/customerProcessForm1")
	public String processCust(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
			return "customerForm";
		else
			return "customerConf";
	}
}
