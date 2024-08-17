package com.acintyo.emp.dto;

import lombok.Data;

@Data
public class Response {
 private boolean status;
 private String message;
 private ResponseDto data;
}