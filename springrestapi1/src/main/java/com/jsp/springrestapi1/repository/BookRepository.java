package com.jsp.springrestapi1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.springrestapi1.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

@Query("SELECT b1 FROM Book b1 " + 
"WHERE b1.price <= :price AND b1.pages > :pages ")
List<Book> findByPriceAndPages(@Param("price")double price,@Param("pages") int pages);

	



}
