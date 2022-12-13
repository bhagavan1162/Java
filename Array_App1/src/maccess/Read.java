package maccess;
import java.util.*;
public class Read {
	@SuppressWarnings("removal")
	public void read(Integer a[] , Scanner s) {
		for(int i=0;i<a.length;i++)
		{
			a[i] = new Integer(s.nextInt());
		}
	}
}