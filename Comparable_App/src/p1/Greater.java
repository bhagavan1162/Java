package p1;

public class Greater {
	public int large(int x,int y,int z)
	{
		if((x>y)&&(x>z))
		{
			return x;
		}
		else if((y>x)&&(y>z))
		{
			return y;
		}
		else if((z>x)&&(z>y))
		{
			return z;
		}
		return x;
	}
}
