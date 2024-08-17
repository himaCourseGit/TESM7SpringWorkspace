package com.acintyo.emp.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorHandler implements Serializable {
 private LocalDateTime time;
 private String msg;
 private String status;
}
