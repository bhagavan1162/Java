package maccess;
import java.util.*;
public class DemoString2 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		int count = 0;
		int len = str.length();
		for(int i=0;i<len;i++)
		{
			char v = str.charAt(i);
			if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u')
			{
				count+=1;
			}
		}
		System.out.println("Vowels count:"+count);
		s.close();
	}
}
