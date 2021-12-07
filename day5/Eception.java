package day5;

public class Eception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<10;i++){
			try {
			if(i==5) {
				i=i/0;
			}
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

}
