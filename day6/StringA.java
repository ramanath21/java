package day6;

import java.util.ArrayList;

public class StringA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
        list.add("java");
        list.add("php");
        list.add("python");

        for(String x  : list)
        {
        System.out.println(x);    
        }
	}

}
