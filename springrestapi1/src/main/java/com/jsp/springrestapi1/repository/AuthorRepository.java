package com.jsp.springrestapi1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springrestapi1.entity.Author;


public interface AuthorRepository extends JpaRepository<Author,Integer> {

}
