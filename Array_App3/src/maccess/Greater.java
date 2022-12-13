package maccess;
public class Greater {
	public int greater(Integer a[])
	{
		int max = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		return max;
	}
}
