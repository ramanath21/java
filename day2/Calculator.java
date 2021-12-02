import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b, res;
	      int choice,run=1;
	      
	     
	      Scanner scan = new Scanner(System.in);
	      while(run==1) {
	      System.out.println("Enter any First Number: ");
	         a = scan.nextFloat();
	         System.out.println("Enter any Second Number: ");
	         b = scan.nextFloat();
	      System.out.println("1. Addition");
	      System.out.println("2. Subtraction");
	      System.out.println("3. Multiplication");
	      System.out.println("4. Division");
	      System.out.println("Enter Your Choice (1-4): ");
	      choice = scan.nextInt();
	      
	      if(choice>=1 && choice<=4)
	      {
	         
	         
	         if(choice==1)
	            res = a+b;
	         else if(choice==2)
	            res = a-b;
	         else if(choice==3)
	            res = a*b;
	         else
	            res = a/b;
	         
	         System.out.println("Result = " +res);
	      }
	      else
	         System.out.println("Invalid Choice!");
	      System.out.println("Do you want to Run Again press 1 or else press 0");
	      run=scan.nextInt();
	      }
	      System.out.println("Thank you ");
	}

}
