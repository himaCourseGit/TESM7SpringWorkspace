package org.jsp.springMVC.controller;

import org.jsp.springMVC.entity.UserInfo;
import org.jsp.springMVC.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
//display register page
	@RequestMapping("/register")
	public String displayRegisterPage() {
		return "Register";
	}
	@Autowired
	private UserInfoService service;
	//to perform registration
	@RequestMapping("/registration")
	public String performregistration (@ModelAttribute UserInfo info,@RequestParam("confirmPwd")String  confirmPwd,Model m)
	{
		if(confirmPwd.equals(info.getPassword()))
		{
			int status=service.registration(info);
			System.out.println(info);
			//return "<h1>Registration successfull...<h1>";
			m.addAttribute("msg","Registration successfull!!...");
			return "Login";
		}
		else {
			//return "please enter valid password"
			m.addAttribute("msg","please Enter valid password");
			return "Register";
			
		}
	}
	//to display login page
	@RequestMapping("/login")
	public ModelAndView displayLogin() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Login");
		return mv;
	}
	//to perform login operation
	@RequestMapping(path="/performLogin",method=RequestMethod.POST)
	public ModelAndView performLogin(@RequestParam("email") String email,@RequestParam("password") String password) {
		UserInfo info=service.login(email,password);
		ModelAndView mv=new ModelAndView();
		if(info!=null) {
			mv.setViewName("Home");
			mv.addObject("message","Login successful...");
			mv.addObject("object",info);
		}
		else {
			//display login page
			mv.setViewName("Login");
			mv.addObject("message", "Invalid credentials");
		}
		return mv;	
	}
}
