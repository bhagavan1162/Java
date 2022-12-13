package test;
public class UserRegistration {
	public StringBuffer sb = null;
	public UserRegistration(StringBuffer sb)
	{
		this.sb=sb;
	}
	public void write(java.util.Scanner s)
	{
		System.out.println("Enter the nubber of userdetails to be added");
		int n = Integer.parseInt(s.nextLine());
		System.out.println("Enter "+n+" userdetails");
		for(int i=1;i<n;i++)
		{
			sb.append(s.nextLine());
			
		}
	}
}
