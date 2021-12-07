package day5;

import java.util.Scanner;

public class Vowelarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of array element");
		int n=sc.nextInt();
		System.out.println("enter the "+n+" charecters");
		char arr[]=new char[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next().charAt(0);
			
			
		}
		int len=arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i]=='a'|arr[i]=='e'|arr[i]=='i'|arr[i]=='o'|arr[i]=='u'|arr[i]=='A'|arr[i]=='E'|arr[i]=='I'|arr[i]=='O'|arr[i]=='U') {
				System.out.println(" vowel char is: ");
				System.out.println(arr[i]);
			}
			
		}
		
		
	}

}
