package test;
public class CustomerDetails {
	public String custId,custName,custCity;
	public CustomerContact cc = new CustomerContact();
	public String toString() {
		return custId+"\t"+custName+"\t"+custCity+"\t"+cc.mailId+"\t"+cc.phNo;
	}
}
