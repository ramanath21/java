package com.employee;

import java.util.Scanner;

import org.springframework.stereotype.Component;
@Component
public class Salary {
	int sal;
	int hra,da,gs,net,tax;
	public Salary() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the salary");
		 sal=sc.nextInt();
		 
		 hra=(int) (sal*0.10);
	        da=(int) (sal*.73);
	        gs=sal+hra+da;
	        tax=(int) (gs*0.30);
	        net=gs-tax;
	      
	}
	public void Calculate() {
		
	}
	void displaysal() {
		System.out.println("HRA: "+hra);
		System.out.println("DA: "+da);
		System.out.println("GS: "+gs);
		System.out.println("tax: "+tax);
		System.out.println("netslary: "+net);
	}
}
