import java.util.Scanner;
class CheckBranch
{
	boolean k = false;
	boolean verify(String branch)
	{
		return switch(branch)
		{
			case "CSE" : yield true;
			case "ECE" : yield true;
			case "EEE" : yield true;
			default : yield false;
		};
	}
}
class SResult
{
	float total(int a, int b, int c, int d, int e, int f)
	{
		return a+b+c+d+e+f;
	}
	float percent(int a, int b, int c, int d, int e, int f)
	{
		return (a+b+c+d+e+f)/6;
	}
}
class Student_Result
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student RollNo:");
		String rollNo = s.nextLine();
		int len = rollNo.length();
		if(len==10)
		{
			System.out.println("Enter the Student Name:");
			String stu = s.nextLine();
			System.out.println("Enter the Student Branch:");
			String br = s.nextLine();
			CheckBranch cb = new CheckBranch();
			boolean k = cb.verify(br.toUpperCase());
			if(k)
			{
				System.out.println("Enter Subject1 Marks:");
				int s1 = s.nextInt();
				System.out.println("Enter Subject2 Marks:");
				int s2 = s.nextInt();
				System.out.println("Enter Subject3 Marks:");
				int s3 = s.nextInt();
				System.out.println("Enter Subject4 Marks:");
				int s4 = s.nextInt();
				System.out.println("Enter Subject5 Marks:");
				int s5 = s.nextInt();
				System.out.println("Enter Subject6 Marks:");
				int s6 = s.nextInt();
				if(s1>0 && s2>0 && s3>0 && s4>0 && s5>0 && s6>0 && s1<100 && s2<100 && s3<100 && s4<100 && s5<100 && s6<100)
				{
					SResult sr = new SResult();
					float totMarks = sr.total(s1,s2,s3,s4,s5,s6);
					System.out.println("Total Marks="+totMarks);
					float percentage = sr.percent(s1,s2,s3,s4,s5,s6);
					System.out.println("Pecentage="+percentage);
				}
				else
				{
					System.out.println("Invalid Marks...");
				}		
			}
			else
			{
				System.out.println("Invalid Branch...");
			}
		}
		else
		{
			System.out.println("Invalid RollNo...");
		}
	}
}	
		