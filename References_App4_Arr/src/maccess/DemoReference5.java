package maccess;
import test.*;
import java.util.*;
public class DemoReference5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of Customers");
		int n = Integer.parseInt(s.nextLine());
		CustomerDetails ob[] = new CustomerDetails[n];
		System.out.println("Enter "+n+" Customer Details");
		for(int i=0; i<ob.length;i++)
		{
			ob[i]=new CustomerDetails();
			System.out.println("Enter the CustId:");
			ob[i].custId = s.nextLine();
			System.out.println("Enter the CustName:");
			ob[i].custName = s.nextLine();
			System.out.println("Enter the CustCity:");
			ob[i].custCity = s.nextLine();
			System.out.println("Enter the CustMailId:");
			ob[i].cc.mailId = s.nextLine();
			System.out.println("Enter the CustPhNo:");
			ob[i].cc.phNo = Long.parseLong(s.nextLine());
		}
		System.out.println("***Customer Details***");
		for(int i=0;i<ob.length;i++)
		{
			System.out.println(ob[i].toString());
		}
		s.close();
	}

}
