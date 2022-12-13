package maccess;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = s.nextLine();
		StringBuffer sb = new StringBuffer(str);
		int len = str.length();
		int i;
		String reverse="";
		for(i=len-1;i>=0;i--)
		{
			reverse = reverse+sb.charAt(i);
		}
		System.out.println("Reverse:"+reverse);
	}

}
