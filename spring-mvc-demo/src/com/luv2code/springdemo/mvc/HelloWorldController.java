package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
		
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String procesForm() {
		return "helloworld";
		
	}
	
	// add a new controller method to read from data and 
	// add data the mode
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request perameter from HTML form
		String theName = request.getParameter("studentName");
	
		// convert the data to all uppercase
		theName =theName.toUpperCase();
			
		// create the message
		String result = "Yo! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	// binding request param 
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,
			Model model) {
		
		// read the request perameter from HTML form
		// theName = request.getParameter("studentName");
	
		// convert the data to all uppercase
		theName =theName.toUpperCase();
			
		// create the message
		String result = "Hey My Friend from v3! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
