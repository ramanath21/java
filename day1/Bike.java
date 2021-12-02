package hello;

import java.util.Scanner;

public class Bike {

	public static void main(String[] args) {
	

Scanner sc=new Scanner(System.in);
String name="ramanath" , tech="java";
int age=22;
int p,r,t,in,a,b,c,d,e,f,l,be,area;

System.out.println("enter p, r, t");
p=sc.nextInt();

r=sc.nextInt();

t=sc.nextInt();
in=p*r*t;
System.out.println("enter 5 numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
f=(a+b+c+d+e)/2;
System.out.println("area ");
l=sc.nextInt();
be=sc.nextInt();
area=l*be;

System.out.println("My Details");
System.out.println("my name is "+name);
System.out.println("i am learning  "+tech+"technology");
System.out.println("my age is "+age);
System.out.println("simple inttest is"+in);
System.out.println("avarage is "+f);
System.out.println("area"+area);
//
int z=20,y=450;
if(z%2==0)
{
System.out.println("number is even");
}
else {
System.out.println("number is odd");
}
if(z>=0) {
	System.out.println("number is positive");
}
else {
	System.out.println("number is negative");
}
if(y>500) {
	System.out.println("grade is A");
}
else if(y>400 && y<=500) {
	System.out.println("grade is B");
}
else if(y>300 && y<=400) {
	System.out.println("grade is c");
}
else {
	System.out.println("fail");
}
int m=20,n=30,o=15;
if(m>n &&m>o) {
	System.out.println("m is greatest one");
}
else if (n>m && n>o) {
	System.out.println("n is greatest one");
}
else {
	System.out.println("o is greatest one");
}


int call=290;
if (call < 100) {
    System.out.println("free");
}
else if (call <= 200 && call>100) {
	System.out.println( "at rs 1 bill "+( ((call - 100)* 1)));
}
else if (call <= 300 && call>200) {
	System.out.println("at rs 2 bill "+((100 * 1)+( (call- 200)* 2)));
}
else if (call> 300) {
	System.out.println( "at rs 3 bill "+((100 * 1)+ (100 * 2)+ ((call - 300)* 3)));
}


int i, Number; 
long Factorial = 1;	
System.out.println(" Please Enter any number to Find Factorial: ");
Number = sc.nextInt();

for (i = 1; i <= Number; i++)  {
	Factorial = Factorial * i;
}
System.out.format("\nFactorial of %d = %d\n", Number, Factorial);

int evenSum = 0;


for( i = 1; i <= 100; i++)
{
	if(i % 2 == 0)
	{
		evenSum = evenSum + i; 
	}
}
System.out.println("\n The Sum of Even Numbers upto 100 =  " + evenSum);
int sum = 0;

for( i = 1; i <= 50; i++) {

  
    if((i % 2) != 0) {

       sum += i;

   }
}

System.out.println("\nSum of odd numbers from 1 to 50 is : " + sum);

int count=0;
System.out.print("Enter a Number: ");
int num = sc.nextInt();

for(i=2; i<num; i++)
{
   if(num%i == 0)
   {
      count++;
      break;
   }
}

if(count==0)
  System.out.println("\nIt is a Prime Number.");
else
   System.out.println("\nIt is not a Prime Number.");

int n1=0,n2=1,n3,countt=20;    
System.out.println(n1+" "+n2); 
 
for(i=2;i<countt;++i)  
{    
n3=n1+n2;    
System.out.println(" "+n3);    
 n1=n2;    
 n2=n3;    
} 

int  j, row=5;   

for(i=0; i<row; i++)   
{   
for(j=0; j<=i; j++)   
{   

System.out.print("* ");   
}   

System.out.println();   
}   
	
int summ=0,nnum=1000;
for ( i=1;i<=nnum;i++) {
	if(i%3==0 && i%5==0) {
	summ=summ+i;	
}

} 
System.out.println(summ);


int units=100;
if (units <=50) {
    System.out.println("free");
}
else if (units <= 100 && units >50) {
	System.out.println( " bill "+( ((units - 50)* 6)));
}
else if (units <= 150 && units>100) {
	System.out.println(" bill "+((50 * 6)+( (units- 100)* 8)));
}
else if (units > 150) {
	System.out.println( "bill "+((50 * 6)+ (50 * 8)+ ((units - 150)* 9)));
}
	}

}
