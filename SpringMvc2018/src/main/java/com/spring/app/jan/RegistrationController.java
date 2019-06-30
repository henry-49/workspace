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
public class RegistrationController {
	
	// @Autowire
	// JDBCTemplate jdbcTemplate;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(ModelMap map) {
		ModelAndView model = new ModelAndView();
		model.addObject("user", new User());
		model.setViewName("register");
		return model;
	}
	
	@RequestMapping(value = "/registrationProcess", method = RequestMethod.POST)
	public ModelAndView saveUser(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user") User user) {
		
		// User Object to Save
		/**
		 * jdbcTemplate.execute(INSERNT INT TBL_NM VALUE ('user.getuserName(), user.getPassword()'));
		 */
		ModelAndView model = new ModelAndView();
		model.addObject("user", user);
		model.setViewName("login");
		return model;
	}

}
