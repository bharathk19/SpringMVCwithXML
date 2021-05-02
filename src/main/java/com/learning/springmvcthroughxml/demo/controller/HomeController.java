package com.learning.springmvcthroughxml.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.springmvcthroughxml.demo.entity.Student;
import com.learning.springmvcthroughxml.demo.entity.StudentStatic;

@Controller
public class HomeController {

	@RequestMapping("/show")
	public String showMyPage() {

		// return "/WEB-INF/views/Html/main-menu.html";
		return "main-menu";
	}

	@RequestMapping("/showForm")
	public String showForm() {
		return "FormPage1";
	}

	@RequestMapping("/processform")
	public String processForm() {
		return "processFrom";
	}

	@RequestMapping("/processingForm")
	public String workWithModel(HttpServletRequest httpRequest, Model theModel) {
		String name = httpRequest.getParameter("studentName");
		name = name.toUpperCase();
		String result = "YO!  " + name;
		theModel.addAttribute("message", result);

		return "processFrom2";
	}

	@RequestMapping("/processForm1")
	public String workWithRequestParam(@RequestParam("studentName") String name, Model theModel) {

		name = name.toUpperCase();
		String result = "YO!  " + name;
		theModel.addAttribute("message", result);

		return "processFrom2";
	}
	
	@RequestMapping("/Showform1")
	public String workWithParameters(Model theModel)
	{
		Student student = new  Student();

		theModel.addAttribute("student",student);
		
		
		return "SpringMvcTag2";
	}
	@RequestMapping("/StaticForm")
	public String workWithParam(Model theModel)
	{
		StudentStatic student = new  StudentStatic();

		theModel.addAttribute("student",student);
		
		
		return "SpringMvcTag";
	}
	
	@RequestMapping("/processForm2")
	public String workWithStudentObject(@ModelAttribute("student") Student theStudent) {
			
		
		return "studentForm";
		
	}
	
	@RequestMapping("/processForm3")
	public String workWithStudentObject(@ModelAttribute("student") StudentStatic theStudent) {
			
		
		return "studentForm";
		
	}

}
