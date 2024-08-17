package com.jsp.springboot.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.springboot.Repository.BookRepository;
import com.jsp.springboot.entity.Book;
@Component
public class BookdaoImpli implements Bookdao {
       @Autowired
       private BookRepository repository;
	@Override
	public int save(Book book) {
		/*
		 * Book1 b=repository.save(book);
		 * int bookId=b.getBookId();
		 * return bookId;
	     */
		return repository.save(book).getBookId();
	}

}
