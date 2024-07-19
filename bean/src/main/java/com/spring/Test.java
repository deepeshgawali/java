package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DepartmentConfig.class);

        // Get bean by type
        Department d1 = context.getBean(Department.class);
        d1.setDepname("IT");

        // Output department name
        System.out.println("Department Name: " + d1.getDepname());

        // Optionally, you can get the bean by name
        // Department d2 = (Department) context.getBean("hellodept");
        // System.out.println("Department Name (by name): " + d2.getDepname());
  
    	/* ApplicationContext context = new AnnotationConfigApplicationContext(DepartmentConfig.class);

         // Retrieve People bean from the context
         People person = context.getBean(People.class);
         person.setName("John Doe");

         // The Department bean should be autowired into People
         System.out.println(person);
         */
    }

}
