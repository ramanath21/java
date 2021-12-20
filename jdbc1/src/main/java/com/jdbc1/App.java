package com.jdbc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {

	
		ApplicationContext cc=new ClassPathXmlApplicationContext("config.xml");
	EmployeeOperation e=(EmployeeOperation)cc.getBean("operationdemo");
	
	Emptable e1=new Emptable();
	e1.setName("ramana");
	e1.setAddress("udu");
	e1.setRole("Train");
	e1.setSalary("4000");
	e1.setId("4");
	int  result=e.insert(e1);
	
	System.out.println(result);
	
	
	
	
}
}
