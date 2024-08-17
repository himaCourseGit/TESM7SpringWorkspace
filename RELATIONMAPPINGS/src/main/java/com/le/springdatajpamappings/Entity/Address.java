package com.le.springdatajpamappings.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Transactional
@Entity
@Table(name="Address_dtls")
public class Address implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="add_id")
	private Long address_Id;
	private String city;
	private String address_type;
	
	//it is applicable for one to one bidirectional mapping
	//@OneToOne(mappedBy="address")
	//private Employeeee employee;
	
	//no need to change in address for one to many
}
