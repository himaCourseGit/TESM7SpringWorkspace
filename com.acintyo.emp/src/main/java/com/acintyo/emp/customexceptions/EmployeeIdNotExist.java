package com.acintyo.emp.customexceptions;

import lombok.Data;

@Data
public class EmployeeIdNotExist extends RuntimeException {
	public EmployeeIdNotExist(String message) {
		super(message);
	}

}
