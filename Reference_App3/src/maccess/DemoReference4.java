package maccess;
import test.*;
import java.util.*;
public class DemoReference4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CustomerDetails cd = new CustomerDetails();
		System.out.println("Enter the CustId:");
		cd.custId = s.nextLine();
		System.out.println("Enter the CustName:");
		cd.custName = s.nextLine();
		System.out.println("Enter the CustCity:");
		cd.custCity = s.nextLine();
		System.out.println("Enter the CustMailId:");
		cd.cc.mailId = s.nextLine();
		System.out.println("Enter the CustPhNo:");
		cd.cc.phNo = s.nextLong();
		String data = cd.toString();
		System.out.println(data);
		s.close();
	}

}
