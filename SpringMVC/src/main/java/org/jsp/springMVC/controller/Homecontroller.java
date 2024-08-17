package org.jsp.springMVC.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.springMVC.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Homecontroller {
//display User jsp file
	@RequestMapping("/user")
	public String displayUser() {
		return "User";
	}
	//To perform update salary operation
	@ResponseBody
	@RequestMapping("/updateSalary")
	public String updateSalary(@RequestParam("id") int empId,@RequestParam("salary") double salary) {
		return "Id="+empId+", Salary="+salary;
		
	}
	@RequestMapping("/addEmp")
	@ResponseBody
	public String addEmployee(
		@ModelAttribute Employee emp) {
		System.out.println("Name="+emp.getEname());
		System.out.println("Id="+emp.getEmpId());
		System.out.println("Salary="+emp.getSalary());
		System.out.println("DeptNo="+emp.getDeptNo());
		return ""+ emp;
	}
	@RequestMapping("/displayData")
	//to transfer data from controller to view - model interface
	public String displayDataOfWebpage(Model model) {
		int a=10;
		double b=60000;
		//transfer data
		model.addAttribute("number",a);
		model.addAttribute("number1",b);
		model.addAttribute("msg", "This data from Controller");
		System.out.println("Data transferred");
		//provide jsp file name
		return "Demo";
		
	}
	@RequestMapping("/showOutput")
public String showOutput(Model model)	{
		List<String> list=new ArrayList<String>();
		list.add("Spring");
		list.add("Hibernate");
		list.add("Corejava");
		model.addAttribute("subjects", list);
		
	return "Demo2";
		
	}
	@RequestMapping("/printData")
	public ModelAndView printData()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Demo3");
		//to transfer data
		double sal=60000;
		mv.addObject("salary",sal);
		return mv;
		
	}
	//TO display add.jsp file
	@RequestMapping("/addFile")
	public String showAddJspFile() {
		return "add";
	}
	//to perform addition
	@RequestMapping("/addition")
	public String performAddition(@RequestParam("num1") int n1,@RequestParam("num2") int n2,Model model) {
	int result=n1+n2;
	model.addAttribute("number1",n1);
	model.addAttribute("number2",n2);
	model.addAttribute("output",result);
	return "output";
}
	
	
}
