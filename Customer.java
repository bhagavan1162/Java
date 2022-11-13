import java.util.Scanner;
class CustomerDetails
{
	String id,name;
	CustomerDetails(String a, String b)
	{	
		id = a;
		name = b;
	}
	void getCustomerDetails()
	{
		System.out.println("===Customer Details===");
		System.out.println("Customer Id:"+id);
		System.out.println("Customer Name:"+name);
	}
}
class CustomerAddress
{
	String hNo, sName, city;
	int pinCode;
	CustomerAddress(String a, String b, String c, int d)
	{
		hNo = a;
		sName = b;
		city = c;
		pinCode = d;
	}
	void getCustomerAddress()
	{
		System.out.println("===Customer Address===");
		System.out.println("House Number:"+hNo);
		System.out.println("Street Name:"+sName);
		System.out.println("City:"+city);
		System.out.println("Pin Code:"+pinCode);
	}
}
class CustomerContact
{
	long phNo;
	String mail;
	CustomerContact(long a, String b)
	{
		phNo = a;
		mail = b;
	}
	void getCustomerContact()
	{
		System.out.println("===Customer Contact===");
		System.out.println("Phone Number:"+phNo);
		System.out.println("E-mail:"+mail);
	}
}
class Customer
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Id:");
		String cId = s.nextLine();
		System.out.println("Enter the Name:");
		String cName = s.nextLine();
		System.out.println("Enter the House No:");
		String cHNo = s.nextLine();
		System.out.println("Enter the Street Name:");
		String cSName = s.nextLine();
		System.out.println("Enter the City:");
		String cCity = s.nextLine();
		System.out.println("Enter the Pincode:");
		int cPincode = Integer.parseInt(s.nextLine());
		System.out.println("Enter the Phone Number:");
		long cPh = Long.parseLong(s.nextLine());
		System.out.println("Enter the E-mail:");
		String cMail = s.nextLine();
		CustomerDetails cd = new CustomerDetails(cId,cName);
		cd.getCustomerDetails();
		CustomerAddress ca = new CustomerAddress(cHNo,cSName,cCity,cPincode);
		ca.getCustomerAddress();
		CustomerContact cc = new CustomerContact(cPh,cMail);
		cc.getCustomerContact();
	}
}
