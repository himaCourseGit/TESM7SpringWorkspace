package com.jsp.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {
@RequestMapping("/showSample")
public ModelAndView displaySample() {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("Sample1");
	return mv;
	
}
}
