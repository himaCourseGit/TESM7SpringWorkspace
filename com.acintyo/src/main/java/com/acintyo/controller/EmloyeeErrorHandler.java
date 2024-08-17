package com.acintyo.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.acintyo.customexceptions.EmployeeAlreadyPresent;
import com.acintyo.customexceptions.EmployeeNotFoundException;
import com.acintyo.dto.Errorhandler;

//@ResponseBody+@ControllerAdvice
@RestControllerAdvice

public class EmloyeeErrorHandler {

	
//	@ExceptionHandler(Insertedemployeedata.class)
//	public ResponseEntity<Errorhandler> insertedEmployeeData(Insertedemployeedata ied){
//		System.out.println("EmployeeErrorHandler.insertedEmployeedata()");
//		Errorhandler insert=new Errorhandler(LocalDateTime.now(),ied.getMessage(),"employeeInserted");
//		return new ResponseEntity<Errorhandler>(insert,HttpStatus.OK);
//	
//	}
	
	
	@ExceptionHandler(EmployeeAlreadyPresent.class)
	public ResponseEntity<Errorhandler> employeeAlreadyPresent(EmployeeAlreadyPresent eap){
		System.out.println("EmployeeErrorHandler.employeealreadypresent()");
		Errorhandler alreadypresent=new Errorhandler(LocalDateTime.now(),eap.getMessage(),"employee already present with this id");
		return new ResponseEntity<Errorhandler>(alreadypresent,HttpStatus.OK);
		
	}
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Errorhandler> handleEmployeeNotFound(EmployeeNotFoundException enf) {
		System.out.println("EmployeeErrorHandler.handleEmployeeNotFound()");
		Errorhandler details = new Errorhandler(LocalDateTime.now(), enf.getMessage(), "404-Employee Not Found");
		return new ResponseEntity<Errorhandler>(details, HttpStatus.OK);
	}
	
	
	

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> handleAllProblems(MethodArgumentNotValidException e) {
		
		Map<String, String> map = new HashMap<>();
		
		e.getBindingResult().getFieldErrors().forEach(x->map.put(x.getField(), x.getDefaultMessage()));
//		System.out.println("EmployeeErrorHandler.handleAllProblems()");
//		Errorhandler problem = new Errorhandler(LocalDateTime.now(), e.getMessage(), "Problem in Execution");
		return ResponseEntity.badRequest().body(map);
	}
	

}
