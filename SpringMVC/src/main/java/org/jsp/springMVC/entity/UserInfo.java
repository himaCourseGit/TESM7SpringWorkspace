package org.jsp.springMVC.entity;

public class UserInfo {
private String firstName;
private String lastName;
private String email;
private String mobile;
private String password;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Userinfo [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobile=" + mobile
			+ ", password=" + password + "]";
}


}
