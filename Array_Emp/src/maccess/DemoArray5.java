package maccess;
import java.util.*;
import test.EmployeeDetails;
public class DemoArray5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Employees:");
		int n = Integer.parseInt(s.nextLine());
		EmployeeDetails ob[] = new EmployeeDetails[n];
		System.out.println("Enter "+n+" EmployeeDetails");
		for(int i=0;i<ob.length;i++)
		{
			System.out.println("Enter the Employee Id:");
			String eId = s.nextLine();
			System.out.println("Enter the Employee name:");
			String eName = s.nextLine();
			System.out.println("Enter the Employee Designation:");
			String eDesg = s.nextLine();
			System.out.println("Enter the Basic Salary:");
			int bSal = Integer.parseInt(s.nextLine());
			System.out.println("Enter the HRA:");
			float hra =(float)(0.93*bSal);
			System.out.println("Enter the DA:");
			float da = (float)(0.63*bSal);
			float totSal = bSal+hra+da;
			ob[i] = new EmployeeDetails(eId,eName,eDesg,bSal,totSal);
		}
		System.out.println("===Display using old for loop===");
		for(int i=0;i<ob.length;i++)
		{
			System.out.print(ob[i].toString());
		}
		/*System.out.println("===Display using Extended for===");
		for(BookDetails k : ob)
		{
			System.out.print(ob[1].toString());
		}*/
		s.close();
	}
}