package com.jsp.springboot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity

@Table(name="emp_table")

public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int empId;
private String empName;
private double salary;
@OneToMany(cascade=CascadeType.ALL,mappedBy="employee",fetch=FetchType.EAGER)
private List<Address> addresses;

@OneToOne(cascade=CascadeType.ALL ,fetch=FetchType.EAGER)
@JoinColumn(name="account_id")
private BankAccount bankAccount;

@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="employee_skills",joinColumns=@JoinColumn(name="emp_fk"),inverseJoinColumns=@JoinColumn(name="skill_fk"))
private List<TechnicalSkills> skills;
}
