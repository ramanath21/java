package day4;

import java.util.Scanner;

public class New {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Car c=new Car();
		System.out.println("enter vehicle \n 1.car \n 2.bus");
		int ch=sc.nextInt();
		
		c.tuneUpCost(ch);
		
		System.out.println("enter passengers");
		int n=sc.nextInt();
		c.canCarry(n,ch);
		

	}

}
