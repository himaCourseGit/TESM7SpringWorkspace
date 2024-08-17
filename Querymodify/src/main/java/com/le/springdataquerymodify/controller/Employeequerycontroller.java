package com.le.springdataquerymodify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.le.springdataquerymodify.Entity.EmployeeQuery;
import com.le.springdataquerymodify.service.employeequeryservice;

@RestController
@RequestMapping("/EmployeeQuery")
public class Employeequerycontroller {
	
	@Autowired
	private employeequeryservice employeeservice;

	@PostMapping("/save")
	public ResponseEntity<EmployeeQuery> insertEmployee(@RequestBody EmployeeQuery empq) {
		EmployeeQuery empquery = employeeservice.insertEmployee(empq);
		return new ResponseEntity<EmployeeQuery>(empquery, HttpStatus.OK);
	}

	@GetMapping("/Employeedata")
	public List<EmployeeQuery> getEmployees() {
		return employeeservice.getemployeedata();

	}

	@GetMapping("/getemployeeallbyactiveanddesignation/{activestate}/{designationlist}")
	public List<EmployeeQuery> getemployeeallbyactiveanddesignation(@PathVariable Boolean activestate,
			@PathVariable List<String> designationlist) {
		return employeeservice.getemployeedatabyactivestatusandDesignation(activestate, designationlist);

	}

	@PutMapping("/updateEmployee/{activestate}/{empidlist}")
	public int updateEmployee(@PathVariable Boolean activestate,@PathVariable List<Long> empidlist) {
		return employeeservice.updateemployeeById(activestate,empidlist);

	}

}
