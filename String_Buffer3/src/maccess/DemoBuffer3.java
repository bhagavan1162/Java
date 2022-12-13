package maccess;
import java.util.*;
public class DemoBuffer3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		StringBuffer sb = new StringBuffer(str);
		int len = sb.length();
		int i;
		String reverse = "";
		for(i=len-1; i>=0; i--)
		{
			reverse = reverse+sb.charAt(i);
		}
		System.out.println("Reverse of string: "+reverse);
		if(str.equals(reverse))
		{
			System.out.println("The String is Palindrome...");
		}
		else
		{
			System.out.println("The String is not a palindrome...");
		}
		s.close();
	}
}
