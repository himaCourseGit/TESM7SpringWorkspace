package com.acintyo.emp.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.acintyo.emp.customexceptions.EmployeeAlreadyPresent;
import com.acintyo.emp.customexceptions.EmployeeIdNotExist;
import com.acintyo.emp.customexceptions.EmployeeNotPresent;
import com.acintyo.emp.customexceptions.EmployeesDataNotFound;
import com.acintyo.emp.dto.ErrorHandler;

@RestControllerAdvice
public class EmployeeErrorHandler {
	@ExceptionHandler(EmployeeAlreadyPresent.class)
	public ResponseEntity<ErrorHandler> employeeAlreadyPresent(EmployeeAlreadyPresent eap){
		System.out.println("EmployeeErrorHndler.employeeeAlredyPresent()");
	ErrorHandler alreadypresent=new ErrorHandler(LocalDateTime.now(),eap.getMessage(),"Employee already Exists withs this id");
		return new ResponseEntity<ErrorHandler>(alreadypresent,HttpStatus.OK);
	
		
	}
	@ExceptionHandler(EmployeesDataNotFound.class)
	public ResponseEntity<ErrorHandler> employeesdatanotFound(EmployeesDataNotFound ednf){
		System.out.println("EmployeeErrorHandler.employeeDataNotFound()");
		ErrorHandler notexist=new ErrorHandler(LocalDateTime.now(),ednf.getMessage(),"Employees data is not exist");
		return new ResponseEntity<ErrorHandler>(notexist,HttpStatus.OK);
		
	}
	
	
	@ExceptionHandler(EmployeeNotPresent.class)
	public ResponseEntity<ErrorHandler> deletebyidnotexists(EmployeeNotPresent enp){
		System.out.println("EmployeeErrorHandler.deletebyidnotexists()");
		ErrorHandler idnotexist=new ErrorHandler(LocalDateTime.now(), enp.getMessage(), "employee id is not exist for deleting");
		return new ResponseEntity<ErrorHandler>(idnotexist,HttpStatus.OK);
		
	}
	@ExceptionHandler(EmployeeIdNotExist.class)
	public ResponseEntity<ErrorHandler> updateByIdNotExist(EmployeeIdNotExist eid ){
		System.out.println("EmployeeIdNotExist.updateByIdNotExist()");
		ErrorHandler replaceid=new ErrorHandler(LocalDateTime.now(),eid.getMessage(),"employee id is not exist,please provide valid id");
		return new ResponseEntity<ErrorHandler>(replaceid,HttpStatus.OK);
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> handleAllProblems(MethodArgumentNotValidException e) {
		
		Map<String, String> map = new HashMap<>();
		
		e.getBindingResult().getFieldErrors().forEach(x->map.put(x.getField(), x.getDefaultMessage()));

		return ResponseEntity.badRequest().body(map);
	}
	

}
