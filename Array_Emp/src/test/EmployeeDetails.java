package test;
public class EmployeeDetails {
	public String eId,eName,eDesg;
	public float totSal;
	public int bSal;
	public EmployeeDetails(String eId, String eName, String eDesg, int bSal, float totSal)
	{
		this.eId=eId;
		this.eName=eName;
		this.eDesg=eDesg;
		this.bSal=bSal;
		this.totSal=totSal;
	}
	public String toString()
	{
		return eId+"\t\t"+eName+"\t"+eDesg+"\t"+bSal+"\t"+totSal;
	}
}