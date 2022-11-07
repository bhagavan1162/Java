import java.util.Scanner;
class ESalary
{
	float calculate(int bSal)
	{
		float hra,da;
		hra =(int)(0.93*bSal);
		da = (int)(0.63*bSal);
		float totSal = (bSal+hra+da);
		return totSal;
	}
}
class EmployeeSalary
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Basic Salary:");
		int bSal = s.nextInt();
		if(bSal>12000)
		{
			ESalary ob = new ESalary();
			float totSal = ob.calculate(bSal);
			System.out.println("Total Salary:"+totSal);
		}
		else
		{
			System.out.println("Invalid Input...");
		}
	}
}
	