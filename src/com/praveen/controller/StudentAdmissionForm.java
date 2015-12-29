package com.praveen.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.servlet.ModelAndView;

import com.praveen.Utils.NameEditor;
import com.praveen.domain.Student;


@Controller
@RequestMapping("/form")
public class StudentAdmissionForm {
	
	//Customization of data binder..function name can be anything just put @initBinder annotation
	
	@InitBinder
	public void InitBinder(WebDataBinder binder){
	//	binder.setDisallowedFields(new String[] {"hobby"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****mm****dd");//custum property editor 
		binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class,"name",new NameEditor());
		
	}
	
	
	public void addingCommonObj(Model model1){
		model1.addAttribute("headerMessage", "Spring Academy for Learners ");
		
	}
	
	@RequestMapping(value="/admission" , method = RequestMethod.GET)
	public ModelAndView getAdmission(){
		
		ModelAndView model = new ModelAndView("admissionForm");
		
		return model;
	}

	
	@RequestMapping(value="/submit" , method = RequestMethod.POST)
	public ModelAndView getFormSubbmitted(@Valid @ModelAttribute("student1") Student student , BindingResult result){
		if(result.hasErrors()){
			//for displadying for same html view if any error while auto data binding
			ModelAndView model = new ModelAndView("admissionForm");
			return model;
		}
			
			
		ModelAndView model = new ModelAndView("submit");
		return model;
		
		
		
	}
}
