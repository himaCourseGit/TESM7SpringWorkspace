package com.acintyo.dto;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Component
@PropertySource("classpath:validations.properties")
public class RequestDto {

	@NotNull(message="{validation.notnull.id}")
	private Integer id;
	@NotBlank(message="{validation.notblank.name}")
	private String name;
	@NotNull(message= "{validation.notnull.salary}")
	@Min(value=0,message="{validation.min.salary}")
	private Double salary;
	@NotNull(message= "{validation.notnull.department}")
    @Pattern(regexp= "(?i)^(JAVA|PYTHON)$",message="{validation.pattern.department}")
	//@Pattern(regexp = "(?i)^(CR|DR)$", message = "{validation.pattern.note}")
	private String department;
	
	
}
