import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		  
        str = str.toLowerCase();
    char[] chars = str.toCharArray();

    int count = 0;

    for (int i = 0; i < str.length(); i++)
    {
        if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
            || str.charAt(i) == 'i'
            || str.charAt(i) == 'o'
            || str.charAt(i) == 'u')
        {
            count++;
        }
    }
    System.out.println("no of vowels in : " + count);
	}

}
