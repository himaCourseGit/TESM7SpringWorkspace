package com.jsp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.springboot.Dao.Bookdao;
import com.jsp.springboot.Dao.BookdaoImpli;
import com.jsp.springboot.entity.Author;
import com.jsp.springboot.entity.Book;



@SpringBootApplication
public class WebTechnology1Application {

	public static void main(String[] args) {
           ConfigurableApplicationContext context=SpringApplication.run(WebTechnology1Application.class,args);
           
           Bookdao dao=context.getBean(BookdaoImpli.class);
           
           Author author=new Author();
           author.setAuthorName("RajendraPrasad");
           
           Book b1=new Book();
           b1.setBookName("RRR");
           b1.setBookPages(150);
           b1.setAuthor(author);
           int id=dao.save(b1);
           System.out.println("Book added succesfully!!BookId :"+id);
           
           
           
	}

}
