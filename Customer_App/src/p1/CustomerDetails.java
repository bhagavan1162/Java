package p1;
public class CustomerDetails {
	public String id,name;
	public CustomerDetails(String id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void getCustomerDetails()
	{
		System.out.println("===Customer Details===");
		System.out.println("CID:"+id);
		System.out.println("CName:"+name);
	}
}