package com.le.springdataquerymodify.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class EmployeeQuery {
	     
	
	      @Id
	      @GeneratedValue(strategy = GenerationType.AUTO)
          private Long empId;
          private String name;
          private Integer age;
          private Boolean active;
          @Column(name="Phone_Number")
          private Long Phonenumber=(long)(Math.random()*(Math.pow(10,10)));
          private String designation;
          private Double salary=Math.random()*10000;
          
}
