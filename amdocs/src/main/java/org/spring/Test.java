package org.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DepartmentConfig.class);

        // Retrieve Employee bean from the context
        Employee emp = context.getBean(Employee.class);

        // Print Employee details
        System.out.println(emp);
    }
}

