package com.employee;

import org.springframework.beans.factory.annotation.Autowired;

import com.maven1.Address;

public class Employee {
	 @Autowired
		Salary sal;
		public Salary getSal() {
			return sal;
		}
		
		public void setSal(Salary sal) {
			this.sal=sal;
		}
		
		void display() {
			sal.displaysal();
		}
}
