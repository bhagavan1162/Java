package maccess;
public class Smaller {
	public int smaller(Integer a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<a[0])
				temp= a[i];
		}
		return temp;
	}
}
