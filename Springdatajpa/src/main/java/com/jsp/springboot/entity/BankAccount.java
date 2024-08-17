package com.jsp.springboot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="bankaccount_table")
public class BankAccount {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int accountId;
private String accountNo;
private String IFSCCode;
@OneToOne(cascade=CascadeType.ALL,mappedBy="bankAccount",fetch=FetchType.EAGER)
private Employee employee;
}
