package com.jsp.javaBasedAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class User {
	@Value("ABC")
private String name;
	/*rv of DEpartment*/
	@Autowired
	private Department dept;
	@Override
	public String toString() {
		return "User [name=" + name + ", dept=" + dept + "]";
	}
	
}
