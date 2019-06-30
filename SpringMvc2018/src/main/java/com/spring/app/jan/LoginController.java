package com.spring.app.jan;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	// @Autowire
	// JDBCTemplate jdbcTemplate;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(ModelMap map) {
		ModelAndView model = new ModelAndView();
		model.addObject("user", new User());
		model.setViewName("login");
		return model;
	}
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user") User user) {

		// jdbcTemplate.query(table, SELECT * FROM TABLE WHERE username='' AND password =' user.getPassword');
		
		if(user.getUsername().equals("John") && user.getPassword().equals("John")) {
			ModelAndView modelAndView = new ModelAndView("welcome", "username" , user.getUsername());
			return modelAndView;
		}
		
		ModelAndView modelAndView = new ModelAndView("login", "username" , user.getUsername());
		return modelAndView;
	}
}
