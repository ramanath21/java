package com.maven1;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Address {
	String address,permanent;
	public Address() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the current  address");
		 address=sc.next();
		System.out.println("enter the permanent  address");
		 permanent=sc.next();
		System.out.println("curent address: "+address);
		
	}
	void displaymsg() {
		System.out.println("permamnent address: "+permanent);
	}
}
