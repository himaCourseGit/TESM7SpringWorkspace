package com.jsp.springrestapi1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name="author_table")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorid;
	private String authorName;
	@OneToMany(cascade = CascadeType.ALL,
			fetch=FetchType.EAGER,
			mappedBy = "author")
	private List<Book> books;
	
	
	

}
