package com.jsp.annotations2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//by default id of an object will be same as class name but in camel casing
@Component("b1")
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BankAccount {
	//@vALUE("SBI-9123456780")
	private String accNO;
	//@Value("BINDU")
	private String accHolderName;
public BankAccount(@Value("SBI-1234567890")String accNO,@Value("BINDU") String accHolderName) {
		super();
		this.accNO = accNO;
		this.accHolderName = accHolderName;
		System.out.println("Constructor with 2 arguments..");
	}
@Override
public String toString() {
	return "BankAccount [accNO=" + accNO + ", accHolderName=" + accHolderName + "]";
}
/*public BankAccount(){
  super();
  System.out.println("Default constructor of bankaccount");
 }
 */
public void getBalance() {
	System.out.println("Account Balance:40000");
}
public String getAccNO() {
	return accNO;
}
public void setAccNO(String accNO) {
	this.accNO = accNO;
}
public String getAccHolderName() {
	return accHolderName;
}
public void setAccHolderName(String accHolderName) {
	this.accHolderName = accHolderName;
}
}
