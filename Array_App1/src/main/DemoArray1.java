package main;
import java.util.*;
import maccess.*;
public class DemoArray1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = s.nextInt();
		Integer a[]= new Integer[n];
		System.out.println("Enter "+n+" Integer elements..");
		Read r = new Read();
		r.read(a, s);
		System.out.println("==Display from Array==");
		Display d = new Display();
		d.display(a);
		s.close();
	}
}
