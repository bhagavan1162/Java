package test;
public class StuDetails {
	public String stuName, stuRollNo, stuBranch;
	public StuContact sc = new StuContact();
	public StuAddress sa = new StuAddress();
	public String toString() {
		return stuName+"\t"+stuRollNo+"\t"+stuBranch+"\t"+sa.hNo+"\t"+sa.sName+"\t"+sa.city+"\t"+sa.pincode+"\t"+sc.mailId+"\t"+sc.phNo;
	}
}
