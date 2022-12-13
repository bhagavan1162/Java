package maccess;
import java.util.*;
public class DemoString5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		int len = str.length();
		System.out.println("****Choice****");
		System.out.println("1.substring(int)\n2.substring(int,int)");
		System.out.println("Enter the choice:");
		int choice = Integer.parseInt(s.nextLine());
		switch(choice)
		{
		case 1:
			System.out.println("Enter the index:");
			int index = Integer.parseInt(s.nextLine());
			if(index>=0 && index<=len-1)
			{
				String str1 = str.substring(index);
				System.out.println("substring :"+str1);
			}
			else
			{
				System.out.println("Invalid index...");
			}
			break;
		case 2:
			System.out.println("Enter beginning index:");
			int bindex = Integer.parseInt(s.nextLine());
			if(bindex>=0 && bindex<=len-1)
			{
				System.out.println("Enter ending-index:");
				int eindex = Integer.parseInt(s.nextLine());
				if(eindex>bindex && eindex<=len-1)
				{
					String str2 = str.substring(bindex, eindex);
					System.out.println("Substring:"+str2);
				}
				else 
				{
					System.out.println("Invalid ending index...");
				}
			}
			else {
				System.out.println("Invalid beginning index...");
			}
			break;
		default :
			System.out.println("Invalid choice...");
		}
		s.close();
	}

}
