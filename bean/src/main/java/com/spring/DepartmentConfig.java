package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepartmentConfig {
@Bean
public Department  hellodept() {
	return new Department();
}
}
