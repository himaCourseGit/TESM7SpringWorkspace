package org.jsp.annotations;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("b1")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BankAccount {
private String accNO;
private String accHolderName;
public BankAccount() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Default Constructor of BankAccount");
}
public void getBalnace() {
	System.out.println("Account Balance: 40000");
}
}
