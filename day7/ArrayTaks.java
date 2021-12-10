package day7;

import java.util.ArrayList;
import java.util.Scanner;



public class ArrayTaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		ArrayList<Integer> a3=new ArrayList<>();
 System.out.println("enter thecount for number");
 int n=sc.nextInt();
 System.out.println("enter "+n+" numbers");
 for(int i=0;i<n;i++) {
	int num=sc.nextInt(); 
	   if(num%2==0) {
		  
		   a1.add(num);
			
		   
	   }
	   else {
		 
		   a2.add(num);
			   }
	   int digit=num;
	   int r=digit-1;
	   int count=1;
	   while(r!=0)
	   {
	   if(digit%r==0)
	   count++;
	   r--;
	   }
	   if(count==2)
	   a3.add(num);
	   }
	   

 for(int  x  : a1)
 {
 System.out.println("even numbers "+x);    
 }
 for(int  y  : a2)
 {
 System.out.println("odd numbers "+y);    
 }
 for(int  z  : a3)
 {
 System.out.println("prime numbers "+z);    
 }
}
}
