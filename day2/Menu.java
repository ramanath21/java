import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ch=80,coffe=85,meals=150,frice=150,cold=20,milks=100,dosa=30,b=1,l=2,d=3,sum=0,i,run=1;

Scanner sc=new Scanner(System.in);
while(run==1) {
System.out.println("---menu---");
System.out.println("1.breakfast");
System.out.println("2.lunch");
System.out.println("3.dinner");
System.out.println("enter your choice(1-3)");
int cho=sc.nextInt();

if(cho>=1 && cho<=3) {
	
	
	
	
	
	
	
	
	
	while(b==cho) {
	if(cho==1) {
		
		System.out.println("1.tea");
		System.out.println("2.dosa");
		System.out.println("3.coffe");
		i=sc.nextInt();
		if(i==1) {
			sum+=ch;
		}
		else if (i==2)
		{
			sum+=dosa;
		}
		else {
			sum+=coffe;
		}
		}
		System.out.println("do you want to oredr press 1 for yes or 0 for no");
		b=sc.nextInt();
		
	}
		while(l==cho) {
	if(cho==2) {
		
		System.out.println("1.meals");
		System.out.println("2.fired rice");
		System.out.println("3.cold");
		i=sc.nextInt();
		if(i==1) {
			sum+=meals;
		}
		else if (i==2)
		{
			sum+=frice;
		}
		else {
			sum+=cold;
		}
		}
		System.out.println("do you want to oredr press 2 for yes or 0 for no");
		l=sc.nextInt();
		
	}
		while(d==cho) {
	if(cho==3) {
		
		System.out.println("1.meals");
		System.out.println("2.dosa");
		
		i=sc.nextInt();
		if(i==1) {
			sum+=meals;
		}
		else 
		{
			sum+=dosa;
		}
		
		}
		System.out.println("do you want to oredr press 3 for yes or 0 for no");
		d=sc.nextInt();
		
	}
	
	
}
System.out.println("For main menu press 1 print bill press 0 ");
run=sc.nextInt();
}
System.out.println("please pay bill Rs "+sum);
System.out.println("Thank you and visit Again ");
	}

}
