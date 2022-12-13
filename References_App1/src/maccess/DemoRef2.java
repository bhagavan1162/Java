package maccess;
import java.util.*;
import test.*;
public class DemoRef2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StuDetails sd = new StuDetails();
		System.out.println("Enter the Student Name:");
		sd.stuName=s.nextLine();
		System.out.println("Enter the Student RollNo:");
		sd.stuRollNo=s.nextLine();
		System.out.println("Enter the Student Branch:");
		sd.stuBranch=s.nextLine();
		System.out.println("Enter the Student HNo:");
		sd.sa.hNo=s.nextLine();
		System.out.println("Enter the Student Street Name:");
		sd.sa.sName=s.nextLine();
		System.out.println("Enter the Student city:");
		sd.sa.city=s.nextLine();
		System.out.println("Enter the Student pincode:");
		sd.sa.pincode= Integer.parseInt(s.nextLine());
		System.out.println("Enter the Student mailId:");
		sd.sc.mailId=s.nextLine();
		System.out.println("Enter the Student PhNo:");
		sd.sc.phNo=s.nextLong();
		String data = sd.toString(); 
		System.out.print(data);
		s.close();
	}
}
