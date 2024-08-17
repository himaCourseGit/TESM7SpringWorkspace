package com.le.springdatajpamappings.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Transactional
@Table(name="employee_details")
public class Employeeee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="emp_id")
	private Long empid;
	private String empName;
	private Integer empage;
	
	
	//it is for one to one single direction mapping
	//address_add_id
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="fk_add_id")
	//private Address address;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_emp_id",referencedColumnName = "emp_id")
	private List<Address> address;
	
	
	
}
