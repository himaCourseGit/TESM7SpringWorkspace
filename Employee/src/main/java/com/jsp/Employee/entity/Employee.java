package com.jsp.Employee.entity;

import org.hibernate.sql.ast.tree.from.MappedByTableGroup;
import org.springframework.data.annotation.Id;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Data
@Entity
@Table(name="Employee")


public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO )
	private int employeeId;
	private String employeeName;

		
		
		
	}
	
	
	
	