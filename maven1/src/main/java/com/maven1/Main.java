package com.maven1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Maven.maven1.Message;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile2.xml");
        Student pass=(Student)context.getBean("msg");
        pass.display();
	}

}
