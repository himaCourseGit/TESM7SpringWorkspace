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

import com.jsp.springrestapi1.dto.BookDTO;
import com.jsp.springrestapi1.service.BookService;

@RestController//to make use of rest api
@RequestMapping("/api/v1")//to provide unique path for BookController
public class BookController {
	@Autowired
	private BookService bookService;
//create an api to add details in db
	//to take input from postman  in the form of java object
	@PostMapping("/books")
	public ResponseEntity<String> addBook(@RequestBody BookDTO dto) {
		System.out.println(dto);
		//return bookService.addBook(dto);
		int id =bookService.addBook(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("id is "+id);
	}
		//create an api to get details from db based on id
		@GetMapping("/books/(bid)")
		public ResponseEntity<BookDTO> findBook(@PathVariable("bid") int id) {
			//return bookService.findBook(id);
			if(bookService.findBook(id)!=null) {
				return ResponseEntity.status(HttpStatus.FOUND).body(bookService.findBook(id));
			}else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			}
			
		}
		//create an api to get all book details
		@GetMapping("/books")
		public List<BookDTO> getAllBooks(){
			return bookService.getAllBooks();
		}
		@GetMapping("/books/{price}/{pages}")
		public  List<BookDTO> getBooksByPriceAndPages(@PathVariable("pages") int pages,@PathVariable("price") double price){
			return bookService.getBookDetailsBasedOnPricePages(price,pages);
			
		}
		//to send structured response to postman
		//ResponseEntity
		@GetMapping("/display")
		public ResponseEntity<String> giveResponse(){
			return ResponseEntity.ok("This is Response from controller");
			
		}	
	}

