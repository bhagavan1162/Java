import java.util.Scanner;
class EvenOdd{
	int oddRounder(int a)
	{
		if(a==0)
			return -2;
		else if(a<0)
			return -1;
		else if(a%2==0)
			return a;
		else 
		{
			int n = a/10;
			return ((n+1)*10);
		}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		EvenOdd ob = new EvenOdd();
		System.out.println(ob.oddRounder(x));
	}
}
		
		