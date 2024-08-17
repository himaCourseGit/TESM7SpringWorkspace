package com.jsp.springrestapi1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springrestapi1.dto.AuthorDTO;
import com.jsp.springrestapi1.entity.Author;
import com.jsp.springrestapi1.repository.AuthorRepository;
@Service
public class AuthorServiceImple implements AuthorService {
	@Autowired
	private AuthorRepository authorRepository;

	@Override
	public int addAuthor(AuthorDTO dto) {
		// TODO Auto-generated method stub
		Author a1=authorRepository.save(Author.builder().authorName(dto.getAuthorName()).authorid(dto.getAuthorId()).build());
		System.out.println(a1);
		return a1.getAuthorid() ;
	}

}
