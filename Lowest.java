import java.util.Scanner;
class Lowest{
	int getLowest(int a, int b){
		if((a<0)||(b<0))
			return -1;	
		else if((a==0)||(b==0))
			return -2;
		else if(a<b)
			return a;
		else
			return b;
			
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num1:");
		int x = s.nextInt();
		System.out.println("Enter the num2");
		int y = s.nextInt();
		Lowest ob = new Lowest();
		System.out.println(ob.getLowest(x,y));
	}
}
		