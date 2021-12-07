import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the base number");
		 int basenumber = sc.nextInt();
		 System.out.println(" enter the exponential");
		 int exponent = sc.nextInt();
		  long temp = 1;

		  while (exponent != 0) {
		   temp *= basenumber;
		   --exponent;
		  }

		  System.out.println("Result: " + temp);
	}

}
