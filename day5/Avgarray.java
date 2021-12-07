package day5;

import java.util.Scanner;

public class Avgarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int sum=0;
System.out.println("enter the number of array element");
int n=sc.nextInt();
System.out.println("enter the "+n+" numbers");
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	 sum=sum+arr[i];
}
int avg=sum/n;
System.out.println("the avarage of array elements is "+avg);
	}

}
