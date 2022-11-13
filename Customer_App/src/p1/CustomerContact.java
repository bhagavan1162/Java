package p1;

public class CustomerContact {
	public String mailId;
	public long phNo;
	public CustomerContact(String mailId,long phNo)
	{
		this.mailId=mailId;
		this.phNo=phNo;
	}
	public void getCustomerContact()
	{
		System.out.println("=====CustomerContact=====");
		System.out.println("MailId:"+mailId);
		System.out.println("PhNo:"+phNo);
	}
}
