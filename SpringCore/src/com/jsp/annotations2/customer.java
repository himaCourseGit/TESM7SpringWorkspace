package com.jsp.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class customer {
private int userId;
private String name;
/*ref var of BankAccount*/
@Autowired
private BankAccount account;
public int getUserId() {
	return userId;
}
@Value("10001")
public void setUserId(int userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
@Value("BINDU")
public void setName(String name) {
	this.name = name;
}
public BankAccount getAccount() {
	return account;
}
public void setAccount(BankAccount account) {
	this.account = account;
}
}
