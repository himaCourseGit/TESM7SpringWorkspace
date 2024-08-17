package com.jsp.springboot.builder;

import com.jsp.springboot.builder.Student.StudentBuilder;

public class Application {
public static void main(String[] args) {
	//StudentBuilder builder=new StudentBuilder();
	 Student student=new StudentBuilder().setName("qwerty").setPercentage(67).setRollNo(101).build();

	System.out.println(student);
	//by using static student builder inner class present in student class
	
	Student  s1=Student.builder().setName("XYZ").setRollNo(102).setPercentage(78.9).build();
	System.out.println(s1);
}
}        
