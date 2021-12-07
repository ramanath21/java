import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the number");
		int rows = sc.nextInt();
		System.out.println("pattern");
		for (int i = rows; i >= 1; i--) 
                { 
                        for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - rows; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Enter the numbers of rows : ");
	    int n = sc.nextInt();
	    for (int i = 1; i <= n; i++) {
	      for (int j = 1; j <= i; j++) {
	        System.out.print(j);
	      }
	      System.out.println();
	    }
	    System.out.println("Enter the numbers of rows : ");
	    int nn = sc.nextInt();
	    for (int i = 1; i <= nn; i++) {
	      for (int j = 1; j <= i; j++) {
	        System.out.print(i);
	      }
	      System.out.println();
	    }
	    System.out.println("Enter the number of rows : ");
        int n1 = sc.nextInt();
        for (int i = 1; i <= n1; i++) {
            for (int j = n1 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
