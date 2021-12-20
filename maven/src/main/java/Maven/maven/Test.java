package Maven.maven;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
@SuppressWarnings("resource")
ApplicationContext context=new ClassPathXmlApplicationContext("NewFile1.xml");
New n=new New();
System.out.println("enter the name");
@SuppressWarnings("unused")
String name=n.setName(sc.next());
System.out.println("enter the id");
@SuppressWarnings("unused")
int id=n.setId(sc.nextInt());
System.out.println("enter the salary");
@SuppressWarnings("unused")
String sal=n.setPrice(sc.next());
n.display();
Student s=(Student)context.getBean("s1");
s.display();
	}

}
