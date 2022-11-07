import java.util.Scanner;
class Check
{
	boolean check(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class CheckEven
{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = c.nextInt();
		if(num>0)
		{
			Check ob = new Check();
			boolean k = ob.check(num);
			if(k)
			{
				System.out.println("Even number...");
			}
			else
			{
				System.out.println("Not-Even number...Odd number");
			}
		}
		else
		{
			System.out.println("Invalid Input...");
		}
	}
}
