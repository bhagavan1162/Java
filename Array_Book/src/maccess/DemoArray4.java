package maccess;
import java.util.*;
import test.BookDetails;
public class DemoArray4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of books:");
		int n = Integer.parseInt(s.nextLine());
		BookDetails ob[] = new BookDetails[n];
		System.out.println("Enter "+n+" BookDetails");
		for(int i=0;i<ob.length;i++)
		{
			System.out.println("Enter the book code:");
			String code = s.nextLine();
			System.out.println("Enter the book name:");
			String name = s.nextLine();
			System.out.println("Enter the book author:");
			String author = s.nextLine();
			System.out.println("Enter the book price:");
			float price = Float.parseFloat(s.nextLine());
			System.out.println("Enter the book quantity:");
			int qty = Integer.parseInt(s.nextLine());
			ob[i] = new BookDetails(code,name,author,price,qty);
		}
		System.out.println("===Display using old for loop===");
		for(int i=0;i<ob.length;i++)
		{
			System.out.print(ob[i].toString());
		}
		System.out.println("===Display using Extended for===");
		/*for(BookDetails k : ob)
		{
			System.out.print(ob[1].toString());
		}*/
		s.close();
	}
}
