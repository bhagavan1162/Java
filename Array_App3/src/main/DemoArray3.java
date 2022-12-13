package main;
import java.util.*;
import maccess.*;
public class DemoArray3 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n = s.nextInt();
		Integer a[]= new Integer[n];
		System.out.println("Enter "+n+" Elements of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("1.Greater\n2.Smaller");
		System.out.println("Enter the choice:");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:
			Greater g = new Greater();
			System.out.println(g.greater(a));
			break;
		case 2:
			Smaller sm = new Smaller();
			System.out.println(sm.smaller(a));
			break;
		default:
			System.out.println("Invalid Choice...");	
		}
		s.close();
	}
}
