package com.jsp.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springboot.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
