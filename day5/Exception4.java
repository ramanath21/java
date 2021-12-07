package day5;

import java.math.BigDecimal;

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BigDecimal x = new BigDecimal(1);
	        BigDecimal y = new BigDecimal(3);
	        x = x.divide(y);
	        
	        System.out.println(x.toString());
	}

}
