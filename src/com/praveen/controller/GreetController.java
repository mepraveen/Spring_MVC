package com.praveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class GreetController {
	
	
	@RequestMapping("/greet")
	public ModelAndView Greet(){
		ModelAndView model = new ModelAndView("greet");
		model.addObject("message", "Message From Controller..!!");
		return model;
		
	}

}
