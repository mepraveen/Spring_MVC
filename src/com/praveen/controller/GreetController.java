package com.praveen.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class GreetController {
	
	// multi action controllor
	//if controller contain more than one mapping it is called multi action controller
	
	
	@RequestMapping("/greet")
	public ModelAndView Greet(){
		ModelAndView model = new ModelAndView("greet");
		model.addObject("message", "Message From Controller..Greet!!");
		return model;
		
	}

	@RequestMapping("/hi/{fname}/{lname}")
	public ModelAndView hello(@PathVariable("fname") String fname, @PathVariable("lname") String lname){
		ModelAndView model = new ModelAndView("greet");
		model.addObject("message", "Hello Your First  name is - "+fname +"  and Last name is -"  +lname);
		return model;
		
	}
	
	
	// we can do above /hi/{fname}/{lname} mapping to get path variable in other way..
	//illustrated below for this you should put <mvc:annotation-driven/> in dispactor servlets
	
	@RequestMapping("/hello/{fname}/{lname}")
	public ModelAndView hello(@PathVariable Map<String,String> map){
		String fname =map.get("fname");
		String lname = map.get("lname");
		
		ModelAndView model = new ModelAndView("greet");
		model.addObject("message", "Hello Your First  name is - "+fname +"  and Last name is -"  +lname+   "(using map");
		return model;
		
		
		
	}
	
	

}
