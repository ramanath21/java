package day5;

import java.util.Scanner;

class  Parent{
	int Numbers()
	{
		int mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks of student");
		mark=sc.nextInt();
		try {
			if(mark<=200) {
				throw new Exception("student is failed");
			}
			else {
				System.out.print("student is passed, ");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return mark;
		}
	int Negative() {
		int mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		mark=sc.nextInt();
		try {
			if(mark<0) {
				throw new Exception("number is negative");
			}
			else {
				System.out.print("number is positive, ");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return mark;
	}
	String length() {
		String mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		mark=sc.nextLine();
		try {
			if(mark.length()<=10) {
				throw new Exception("password length not match ");
			}
			else {
				System.out.print("password is accepted, ");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return mark;
	}
	int Even() {
		
			int mark;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			mark=sc.nextInt();
			try {
				if(mark%2!=0) {
					throw new Exception("number is not even");
				}
				else {
					System.out.print("number is even,  ");
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
			return mark;
		
	}
}

public class Exception7 extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception7 e=new Exception7();
		System.out.println("mark is:"+e.Numbers());
		System.out.println("number is:"+e.Negative());
		System.out.println("length is:"+e.length());
		System.out.println("number is:"+e.Even());
	}

}
