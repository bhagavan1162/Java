package test;
public class DataReader {
	public StringBuffer sb =null;
	public DataReader(StringBuffer sb) {
		this.sb=sb;
	}
	public void read()
	{
		System.out.println("***Display from Buffer***");
		System.out.println(sb.toString());
	}
}
