package day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> map= new ArrayList<>();
		map.add("java");
		map.add("php");
		map.add("android");
		
		
		System.out.println(map);
		
		
		ListIterator<String> i=map.listIterator(); 
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		while(i.hasPrevious())
		{
		System.out.println(i.previous());
		}
	}

}
