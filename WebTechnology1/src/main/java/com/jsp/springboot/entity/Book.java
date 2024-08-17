package com.jsp.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@ToString
@Entity
//@Table(name="book_table")
public class Book {
@Id
//to define one to one relationship
@GeneratedValue
(strategy=GenerationType.AUTO)
//TO generated id automatically
private int bookId;
private String bookName;
private double bookPages;
//to define one-to-one relationship
@OneToOne
@JoinColumn(name="authorId")
//Unidirectional
private Author author;
}
