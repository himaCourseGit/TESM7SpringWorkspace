package com.jsp.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DepartmentDaoImplementation implements DepartmentDao{
	@Autowired
	private JdbcTemplate template;

	@Override
	public int insertRecord() {
		int record=template.update("insert into department values(20,'production','VJZ')");
		System.out.println("Record inserted");
		return record;
	}

}
