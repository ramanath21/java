package day6;

import java.util.ArrayList;

public class Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Laang> list=new ArrayList<>();
		Laang l1=new Laang("java ",9);
		Laang l2=new Laang("Android",9);
		
		list.add(l1);
		list.add(l2);
		 System.out.println("name"+" marks");
		 for( Laang l:list)
         {
			
             System.out.println(l.name+"  "+l.mark);
         }
	}

}
class Laang{
	String name;
	int mark;
	public Laang(String name, int mark) {
		super();
		this.name=name;
		this.mark=mark;
		
	}
}
