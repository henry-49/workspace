package com.spring.app.jan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//http://localhost:8080/login
//http://localhost:8080/addUser
@Controller
public class HelloController {

	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	public String sayHello(ModelMap map) {
		map.addAttribute("message", "Spring Booking Application");
		return "hello";
	}
	
	@RequestMapping(value = "/sayHelloTo/{name}", method = RequestMethod.GET)
	public ModelAndView sayHelloTo(@PathVariable("name") String name) {
		ModelAndView model = new ModelAndView();
		model.addObject("msg", name);
		model.setViewName("hello");
		return model;
	}
	
}
