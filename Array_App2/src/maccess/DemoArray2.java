package maccess;
import java.util.*;
public class DemoArray2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = Integer.parseInt(s.nextLine());
		String str[] = new String[n];
		System.out.println("Enter "+n+" Elements of Array...");
		for(int i=0;i<str.length;i++)
		{
			str[i] = s.nextLine();
		}
		for(int j=0;j<str.length;j++)
		{
			StringBuffer sb = new StringBuffer(str[j]);
			char ch = sb.charAt(0);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				continue;
			}
			else
			{
				System.out.println(str[j].toString());
			}
		}
		s.close();
	}
}