package day6;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
ArrayList<Stud> list=new ArrayList<>();
System.out.println(" enter the name");
 String name=sc.next();
 System.out.println(" enter the marks");
 int m1=sc.nextInt();
 int m2=sc.nextInt();
 int m3=sc.nextInt();
 
 Stud s1=new Stud(name,m1,m2,m3);
 
 list.add(s1);
System.out.println("name\t mark1\tmark2\tmark3\t");
 for(Stud s:list) {
	 System.out.println(name+" "+m1+"/500 "+m2+"/500 "+m3+"/500");
 }
	}

}
class Stud{
	String name;
	int m1,m2,m3;
	public Stud(String name,int m1,int m2,int m3) {
		super();
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
}