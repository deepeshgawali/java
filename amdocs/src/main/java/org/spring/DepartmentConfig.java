package org.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepartmentConfig {

    @Bean
    public Employee employee() {
        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setId(1);
        emp.setDepartment(department()); // Injecting Department bean
        return emp;
    }

    @Bean
    public Department department() {
        Department dept = new Department();
        dept.setDepartmentId(101);
        return dept;
    }
}

