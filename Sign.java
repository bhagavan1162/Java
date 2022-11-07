import java.util.Scanner;
class Sign{
	int findSign(int a)
	{
		if(a>0)
			return 1;
		else if(a<0)
			return -1;
		else
			return 0;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x = s.nextInt();
		Sign ob = new Sign();
		System.out.println(ob.findSign(x));
	}
}