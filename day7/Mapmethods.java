package day7;

import java.util.HashMap;

public class Mapmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map= new HashMap<>();
		map.put("key1","ramanath");
		map.put("key2","kamath");
		map.put("key3","trainee");
		
		System.out.println(map);
		map.clear();
		System.out.println(map);
		map.put("key1","ramanath");
		map.put("key2","kamath");
		map.put("key3","trainee");
		
		System.out.println(map.isEmpty());
		map.put("key1","ramanath");
		map.put("key2","kamath");
		map.put("key3","trainee");
		
		System.out.println(map.keySet());
		map.put("key1","ramanath");
		map.put("key2","kamath");
		map.put("key3","trainee");
		map.remove("key3");
		System.out.println(map);
		map.put("key1","ramanath");
		map.put("key2","kamath");
		map.put("key3","trainee");
		System.out.println(map.get("key1"));
		map.replace("key1", "raman");
		System.out.println(map);
		System.out.println(map.size());
//		clear()
//		isEmpty()
//		keySet()
//		putAll()
//		remove()
//		containsKey()
//		equals()
//		get(Object Key)
//		replace(key,new value)
//		size()

	}

}
