package maccess;
import java.util.*;
public class DemoString4 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		int len = str.length();
		int vcount=0, acount=0, ncount=0, ocount=0, sum=0;
		for(int i=0;i<=len-1;i++)
		{
			char ch = str.charAt(i);
			switch(ch)
			{
			case 'a':
			case 'A':vcount++;
				break;
			case 'e':
			case 'E':vcount++;
				break;
			case 'i':
			case 'I':vcount++;
				break;
			case 'o':
			case 'O':vcount++;
				break;
			case 'u':
			case 'U':vcount++;
				break;
			}
			int k = (int)ch;
			if((k>=65 && k<=90) || (k>=97 && k<=122))
			{
				acount++;
			}
			else if(k>=48 && k<=57)
			{
				ncount++;
				sum+=Character.getNumericValue(ch);
			}
			else
			{
				ocount++;
			}
		}
		System.out.println("Count of Vowels:"+vcount);
		System.out.println("Count of Consonents:"+(acount-vcount));
		System.out.println("Count of Alphabets:"+acount);
		System.out.println("Count of Numerics:"+ncount);
		System.out.println("Count of Others:"+ocount);
		System.out.println("Sum of numbers:"+sum);
		s.close();
	}
}
