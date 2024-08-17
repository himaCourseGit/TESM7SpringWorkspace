package com.acintyo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Employee2")
public class Employee {
	@Id
	//@Column(length=10,name="employeeid")
    //@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private Integer id;
	private String name;
	private Double salary;
	private String department;

}
