package test;
public class DataWriter {
	public StringBuffer sb = null;
	public DataWriter(StringBuffer sb) {
		this.sb=sb;
	}
	public void write(java.util.Scanner s)
	{
		System.out.println("Enter the number of Strings:");
		int n = Integer.parseInt(s.nextLine());
		System.out.println("Enter "+n+"number of Strings to be added to buffer");
		for(int i=1;i<=n;i++)
		{
			sb.append(s.nextLine()+" : ");
			System.out.println("Data appended to buffer...");
		}
	}
}