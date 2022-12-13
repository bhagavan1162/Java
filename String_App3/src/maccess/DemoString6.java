package maccess;
import java.util.*;
import test.GenerateBranch;
public class DemoString6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Student RollNo:");
		String rollNo = s.nextLine();
		int len = rollNo.length();
		if(len==10)
		{
			String brCode = rollNo.substring(6,8);
			GenerateBranch gb = new GenerateBranch();
			String branch = gb.generate(brCode);
			if(branch==null)
			{
				System.out.println("RollNo holding Invalid Branch...");
			}
			else
			{
				System.out.println("RollNo belongs to "+branch);
			}
		}
		else
		{
			System.out.println("Invalid RollNo...");
		}
		s.close();
	}

}
