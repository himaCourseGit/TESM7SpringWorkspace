package org.jsp.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Applicationcontroller {
//Handler mapper method-execute-send a request for respective url
	@RequestMapping("/display")
	public void displaymessage() {
		System.out.println("1st Handler mapper of Applicationcontroller class");
		System.out.println("this display method");
	}
	@RequestMapping("/sample")
	//to print output an webpage
	
	@ResponseBody
	public String displayOutput()
	{
		return "<h1>output printed as webpage</h1>";
	}
	//to display jsp file
    @RequestMapping("/demo")
    public String displayJspFile()
    {
    	return "Demo";
    }
    //to display jsp file -ViewTemplate
    @RequestMapping("/demo2")
    public String displayJspFile2()
    {
    	return "Demo2";
    }
    //to display jsp file-view Template and ModelAndView Class
    //Standard program
    @RequestMapping("/demo3")
    public ModelAndView displayJspFile3()
    {
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("Demo3");
    	return mv;
    			
    }
    //to display demo jsp file
    @RequestMapping("/showDemo")
    public ModelAndView showDemoFile() {
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("Demo");
    	return mv;
    }
	@RequestMapping("/perform")//execute method -user click on submit button
	public void performOperation() {
		System.out.println("perform operation method executed...");
	}
}
