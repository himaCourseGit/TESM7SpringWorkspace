package com.jsp.springboot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class TechnicalSkills {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int skillId;
private String skillName;
@ManyToMany(cascade=CascadeType.ALL,mappedBy="skills")
private List<Employee> employees;
}
