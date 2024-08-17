package com.jsp.springrestapi1.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springrestapi1.dto.BookDTO;
import com.jsp.springrestapi1.entity.Book;
import com.jsp.springrestapi1.repository.BookRepository;
@Service
public class BookServiceImple implements BookService {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public int addBook(BookDTO dto) {
		Book b1=bookRepository.save(Book.builder().bookName(dto.getBookName()).price(dto.getPrice()).pages(dto.getPages()).build());
		System.out.println(b1);
		return  b1.getBookId();
	}

	@Override
	public BookDTO findBook(int bid) {
		// TODO Auto-generated method stub
	Optional<Book> bookObject=bookRepository.findById(bid);
	if(bookObject.isPresent()) {
		Book b1=bookObject.get();//to get book entity object
		//transfer data from bOok to bookdto
		BookDTO dto=BookDTO.builder().bookName(b1.getBookName()).price(b1.getPrice()).pages(b1.getPages()).build();
		return dto;
	}else {
		
	
	return null;
	}
 	
	}

	@Override
	public List<BookDTO> getAllBooks() {
	List<Book> books=bookRepository.findAll();
	if(books.size()>0) {
		//transfer list of book to list of bookdto
		List<BookDTO> dto=books.stream().map(t -> BookDTO.builder().bookName(t.getBookName()).pages(t.getPages()).price(t.getPrice()).build()).collect(Collectors.toList());
		return dto;
	}else {
		return null;
	}
	}

	@Override
	public List<BookDTO> getBookDetailsBasedOnPricePages(double price, int pages) {
		List<Book> booksFromDB=bookRepository.findByPriceAndPages(price,pages);
		if(booksFromDB.isEmpty()) {
		return null;
	}else {
		//transfer book data from entity to dto
		List<BookDTO> dto=booksFromDB.stream().map(t -> BookDTO.builder().bookName(t.getBookName()).pages(t.getPages()).price(t.getPrice()).build())
				.collect(Collectors.toList());
		return dto;
	
	}
}
}
