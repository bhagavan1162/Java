package maccess;
import java.util.*;
public class StringBuilder {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = s.nextLine();
		StringTokenizer ob = new StringTokenizer(str," ");
		System.out.println("===Reverse===");
		int i;
		while(ob.hasMoreTokens())
		{
			String tk = ob.nextToken();
			
			char ch = tk.charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				StringBuffer sb = new StringBuffer(tk);
				System.out.print(tk.toString()+" ");
			}
			else
			{
				StringBuffer sb = new StringBuffer(tk);
				System.out.print(sb.reverse()+" ");
			}
		}
		s.close();
	}
}
