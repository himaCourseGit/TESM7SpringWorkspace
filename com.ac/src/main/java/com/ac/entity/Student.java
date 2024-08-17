package com.ac.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "std")

public class Student {

	@Id
	@Column(length = 10, name = "std_table")
	private Integer id;
	private String name;
	private Double fee;
	private String course;

	
	
}
