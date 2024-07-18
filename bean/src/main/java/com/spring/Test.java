package com.spring;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Employee emp = (Employee) context.getBean("emp");

		 System.out.println(emp);

		 Employee emp1 = (Employee) context.getBean("em5");

		 System.out.println(emp1);

	}

 
}