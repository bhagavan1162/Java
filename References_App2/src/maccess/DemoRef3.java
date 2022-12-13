package maccess;
import test.*;
import java.util.*;
public class DemoRef3 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		DataWriter dw = new DataWriter(sb);
		DataReader dr = new DataReader(sb);
		dw.write(s);
		dr.read();
		s.close();
	}
}
