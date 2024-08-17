package com.jsp.springrestapi1.service;

import java.util.List;

import com.jsp.springrestapi1.dto.BookDTO;

public interface BookService {
 int addBook(BookDTO dto);
 BookDTO findBook(int bid);
 List<BookDTO> getAllBooks();
 List<BookDTO> getBookDetailsBasedOnPricePages(double price,int pages);
}
