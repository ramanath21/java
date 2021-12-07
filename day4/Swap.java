import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, temp;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.println("Enter the Number 1: ");
	      a = s.nextInt();
	      System.out.println("Enter the Number 2: ");
	      b = s.nextInt();
	      
	      temp = a;
	      a = b;
	      b = temp;
	      
	      System.out.println("a = " +a);
	      System.out.println("b = " +b);
	}

}
