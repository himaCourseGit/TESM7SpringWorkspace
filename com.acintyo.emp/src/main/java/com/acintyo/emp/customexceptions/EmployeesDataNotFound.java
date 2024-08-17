package com.acintyo.emp.customexceptions;

public class EmployeesDataNotFound extends RuntimeException{
	public EmployeesDataNotFound(String message) {
		super(message);
	}

}
