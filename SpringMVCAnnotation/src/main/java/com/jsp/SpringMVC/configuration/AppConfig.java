package com.jsp.SpringMVC.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configurable
@ComponentScan(basePackages="com.jsp.SpringMVC")
public class AppConfig {
	@Bean
	public InternalResourceViewResolver getObject() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/views/");
		vr.setSuffix(".jsp");
		return vr;
	}

}
