package com.acintyo.emp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
@Configuration
public class Message {
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
	
	ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	
	messageSource.setBasename("classpath:validations");
	messageSource.setDefaultEncoding("UTF-8");
	return messageSource;
	}
}
