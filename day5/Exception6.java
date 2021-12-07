package day5;

public class Exception6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      int array[] = new int[10];
		      array[1] = 30 / 0;
		    } catch (ArithmeticException  e) {
		      System.out.println(e.getMessage());
		    }
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
