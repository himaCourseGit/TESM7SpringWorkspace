package com.jsp.airline.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name="User_table")
public class User {
@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int Id;
private String FirstName;
private String LastNAME;
private long MobileNumber;
private String Gender;
private String UserName;
private String password;


}
