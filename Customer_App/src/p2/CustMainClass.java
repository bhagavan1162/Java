package p2;
import java.util.Scanner;
import p1.CustomerDetails;
import p1.CustomerAddress;
import p1.CustomerContact;
public class CustMainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the CustId:");
		String id = s.nextLine();
		System.out.println("Enter the CustName:");
		String name = s.nextLine();
		CustomerDetails cd = new CustomerDetails(id,name); 
		System.out.println("Enter the HouseNo:");
		String hNo = s.nextLine();
		System.out.println("Enter the Street Name:");
		String sName = s.nextLine();
		System.out.println("Enter the City:");
		String city = s.nextLine();
		System.out.println("Enter the Pincode:");
		int pinCode = Integer.parseInt(s.nextLine());
		CustomerAddress ca = new CustomerAddress(hNo,sName,city,pinCode);
		System.out.println("Enter the MailId:");
		String mailId = s.nextLine();
		System.out.println("Enter the PhNO:");
		long phNo = s.nextLong();
		CustomerContact cc = new CustomerContact(mailId,phNo);

		cd.getCustomerDetails();
		ca.getCustomerAddress();
		cc.getCustomerContact();

		s.close();
	}

}
