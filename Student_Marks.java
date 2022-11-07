import java.util.Scanner;
class Student_Marks
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student1 marks: ");
		int s1= s.nextInt();
		System.out.println("Enter Student2 marks: ");
		int s2= s.nextInt();
		System.out.println("Enter Student3 marks: ");
		int s3= s.nextInt();
		System.out.println("Enter Student4 marks: ");
		int s4= s.nextInt();
		System.out.println("Enter Student5 marks: ");
		int s5= s.nextInt();
		System.out.println("Enter Student6 marks: ");
		int s6= s.nextInt();
		float percentage;
		int totMarks=s1+s2+s3+s4+s5+s6;
		percentage=(totMarks/6);
		System.out.println(totMarks);
		System.out.println(percentage);
	}
}