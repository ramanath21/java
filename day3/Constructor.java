package day3;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		     Employee e=new Employee("12","35000");
		     System.out.print(e.getDetails());
		}

		}

		class Employee
		{
		    String id,salary;

		        Employee(String x,String  sal)
		        {
		            id=x;
		            salary=sal;
		        }    

		    String getDetails()
		    {
		        return id+" "+salary;
	}

}
