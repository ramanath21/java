package day5;
//To use randomUUID function.




public class Exception3 {

	public static void main(String[] args) {
		
			
				String ptr = null;

				
				try
				{
					
					if (ptr.equals("rk"))
						System.out.print("Same");
					else
						System.out.print("Not Same");
				}
				catch(NullPointerException e)
				{
					System.out.print("NullPointerException Caught"+e);
				}
		
	}

}
