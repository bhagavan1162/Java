package p2;
import java.util.Scanner;
import p1.*;
public class EmpMainClass {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the EmpId:");
		String empId = s.nextLine();
		int len = empId.length();
		if(len==4)
		{
			System.out.println("Enter the EmpName:");
			String empName = s.nextLine();
			System.out.println("Enter the empDesg:");
			String empDesg = s.nextLine();
			Designation dg = new Designation();
			boolean k = dg.verify(empDesg.toUpperCase());
			if(k)
			{
				System.out.println("Enter the BSal:");
				int bSal = s.nextInt();
				if(bSal>=12000)
				{
					ESalary es = new ESalary();
					float totSal = es.calculate(bSal);
					System.out.println("====EmployeeDetails====");
					System.out.println("EmpId:"+empId);
					System.out.println("EmpName:"+empName);
					System.out.println("EmpDesg:"+empDesg);			
					System.out.println("BSal:"+bSal);
					System.out.println("TotSal:"+totSal);
				}
				else
				{
					System.out.println("Invalid BSal...");
				}
			}
			else
			{
				System.out.println("Invalid Designation...");
			}
		}
		else
		{
			System.out.println("Invalid EmpId...");
		}
	}
}
