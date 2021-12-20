package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("MyBeans.xml");
		// TODO Auto-generated method stub
Student s= (Student)context.getBean("s1");
s.display();
	}

}
