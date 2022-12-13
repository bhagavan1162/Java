package p2;
import java.util.Scanner;
import p1.*;
public class StudentMainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student RollNo:");
		String rollNo = s.nextLine();
		int len = rollNo.length();
		if(len==10)
		{
			System.out.println("Enter Student Name:");
			String stu = s.nextLine();
			System.out.println("Enter Student Branch:");
			String br = s.nextLine();
			CheckBranch cb = new CheckBranch();
			boolean k = cb.verify(br.toUpperCase());
			if(k)
			{
				System.out.println("Enter Subject1 marks:");
				int s1 = s.nextInt();
				System.out.println("Enter Subject2 marks:");
				int s2 = s.nextInt();
				System.out.println("Enter Subject3 marks:");
				int s3 = s.nextInt();
				System.out.println("Enter Subject4 marks:");
				int s4 = s.nextInt();
				System.out.println("Enter Subject5 marks:");
				int s5 = s.nextInt();
				System.out.println("Enter Subject6 marks:");
				int s6 = s.nextInt();
				if(s1>0 && s1<100 && s2>0 && s2<100 && s3>0 && s3<100 && s4>0 && s4<100 && s5>0 && s5<100 && s6>0 && s6<100)
				{
					SResult sr = new SResult();
					float totMarks = sr.total(s1,s2,s3,s4,s5,s6);
					System.out.println("Total Marks:"+totMarks);
					float percentage = sr.percent(s1,s2,s3,s4,s5,s6);
					System.out.println("Percentage:"+percentage);
					if((s1>0 && s1<35)||(s2>0 && s2<35)||(s3>0 && s3<35)||(s4>0 && s4<35)||(s5>0 && s5<35)||(s6>0 && s6<35))
					{
						System.out.println("Fail");
					}
					else
					{
						SGrade sg = new SGrade();
						String grade = sg.generate(s1,s2,s3,s4,s5,s6);
						System.out.println("Student Grade:"+grade);
					}
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
