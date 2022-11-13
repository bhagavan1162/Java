package p1;

public class CustomerAddress {
	public String hNo,sName,city;
	public int pinCode;
	public CustomerAddress(String hNo,String sName,String city,int pinCode)
		{
			this.hNo=hNo;
			this.sName=sName;
			this.city=city;
			this.pinCode=pinCode;
		}
	public void getCustomerAddress()
	{
		System.out.println("====CustomerAddress====");
		System.out.println("HNo:"+hNo);
		System.out.println("SName:"+sName);
		System.out.println("City:"+city);
		System.out.println("PinCode:"+pinCode);
	}
}
