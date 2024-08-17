package com.jsp.springrestapi1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springrestapi1.dto.AuthorDTO;
import com.jsp.springrestapi1.service.AuthorService;
@RestController
@RequestMapping("api/v1")
public class AuthorController {
	@Autowired
private AuthorService authorService;
	//create an api to add details in db
	//to take input from postman in the form of java object
	@PostMapping("/Author")
	public ResponseEntity<String> addAuthor(@RequestBody AuthorDTO dto){
		System.out.println(dto);
		//return AuthorService.addAuthor(dto);
		int id=authorService.addAuthor(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("id is "+id);
	}
}
