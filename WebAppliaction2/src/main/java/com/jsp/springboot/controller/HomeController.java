package com.jsp.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.springboot.dao.UserInfoDao;
import com.jsp.springboot.entity.UserInfo1;
import com.jsp.springboot.service.UserInfoService1;

@RestController
public class HomeController {
	@GetMapping("/message")
	public String displayMessage() {
		return "This is rest API";
		
	}
@GetMapping("/test")
	public String showTest() {
		System.out.println("jspfile");
		return "Test";
		
	}
@GetMapping("/sample")
	public ModelAndView showSample() {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("Sample");
		return mv;
	}
//to display registration page
@GetMapping("/userregister")
public ModelAndView showRegistrationPage() {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("registerjsp");
	return mv;
	
}
@Autowired
private UserInfoService1 service;
//to perform registration
@PostMapping(path="/registerjsp")
//@RequestMapping("/register")
public ModelAndView registerUserInfo(@ModelAttribute UserInfo1 info)
{
	UserInfo1 finalOut=service.register(info);
	System.out.println(finalOut);
	ModelAndView mv=new ModelAndView();
	mv.setViewName("Home");
	mv.addObject("info",finalOut);
	return mv;
}
@GetMapping("/login")
public String showLoginPage() {
	return "Login";
	
}
@PostMapping(path="/performLogin")
public ModelAndView verifyDetails(@ModelAttribute UserInfo1 info) {
	UserInfo1 information=service.login(info.getEmail(), info.getPassword());
	ModelAndView mv=new ModelAndView();
	if(information!=null) {
		//display home page
		mv.setViewName("Home");
		mv.addObject("message","Login Successfull!");
		mv.addObject("userinfo",information);
		
	}
	else {
		//display login page
		mv.setViewName("Login");
		mv.addObject("message", "Please enter valid credentials");
	}
	return  mv;
	
}


}
