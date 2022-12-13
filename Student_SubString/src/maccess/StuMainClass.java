package maccess;
import java.util.*;
import p1.*;
public class StuMainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the branch code:");
		int brCode = Integer.parseInt(s.nextLine());
		GenerateBranch gb = new GenerateBranch();
		String branch = gb.generate(brCode);
		System.out.println(branch);
		if(brCode>=1 && brCode<=5)
		{
			System.out.println("Enter the rollNo:");
			String rollNo = s.nextLine();
			int len = rollNo.length();
			if(len==10)
			{
				String br = rollNo.substring(6,8);
				CheckBranch cb = new CheckBranch();
				String checkBr = cb.check(br);
				if(checkBr==branch)
				{
					System.out.println("RollNo belongs to Branch");
				}
				else
				{
					System.out.println("RollNo not belongs to branch");
				}
			}
			else
			{
				System.out.println("Invalid RollNo...");
			}
		}
		else
		{
			System.out.println("Invalid Branch...");
		}
		s.close();
	}

}
