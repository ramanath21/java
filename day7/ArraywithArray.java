package day7;

import java.util.ArrayList;

public class ArraywithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
        list.add("java");
        list.add("php");
        list.add("python");
ArrayList<String> li=new ArrayList<>();
li.add("oop");
li.add("mysql");
li.add("ms sql");
list.addAll(li);

        for(String x  : list)
        {
        System.out.println(x);    
        }
	}

}
