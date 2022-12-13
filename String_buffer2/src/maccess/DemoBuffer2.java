package maccess;
import java.util.*;
public class DemoBuffer2 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String ob = sb.toString();
		System.out.println("Reverse of String: "+ob);
		if(ob.equals(str))
		{
			System.out.println("The String is Palindrome...");
		}
		else
		{
			System.out.println("The String is not Palindrome...");
		}
		s.close();
	}
}
