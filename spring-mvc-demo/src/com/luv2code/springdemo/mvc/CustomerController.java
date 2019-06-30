package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// add initbinder.... to convert trim input string
	// remove leading amd trailing whitespace
	// resove issue for our validation
	@InitBinder
	public void initBinder(WebDataBinder theWebDataBinder) {
		
		StringTrimmerEditor theStringTrimmerEditor = new StringTrimmerEditor(true);
		
		theWebDataBinder.registerCustomEditor(String.class, theStringTrimmerEditor);
		
	}
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, 
			BindingResult theBindingResult) {
		
		System.out.println("Last Name| "+theCustomer.getLastName()+"|");
		
		System.out.println("theBindingResult: "+theBindingResult );
		
		System.out.println("\n\n\n");
		if(theBindingResult.hasErrors()) {
			return "customer-form";	
		}else {
		return "customer-confirmation";
		}
	}

}
