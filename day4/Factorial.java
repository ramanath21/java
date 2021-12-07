import java.util.Scanner;

public class Factorial {

		// TODO Auto-generated method stub
		static int calc_factorial(int num)
		{
		int result;
		if(num==1){
		return 1;
		}
		result= calc_factorial(num-1)* num;
		return result;
		}
		public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int factorial = calc_factorial(number);
		System.out.println("Factorial is: "+factorial);
	}

}
