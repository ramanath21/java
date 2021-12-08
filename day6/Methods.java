package day6;

import java.util.ArrayList;

public class Methods {



public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<>();



list.add("Java");
list.add("JavaScript");
list.add("Python");
System.out.println("Programming Languages: " + list);



list.clear();
System.out.println("ArrayList after clear(): " + list);
list.add("Java");
list.add("JavaScript");
list.add("Python");
System.out.println("Programming Languages: " + list);



list.removeAll(list);
System.out.println("ArrayList after removeAll(): " + list);
}



}
