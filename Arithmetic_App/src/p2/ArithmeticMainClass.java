package p2;
import java.util.*;
import p1.*;
public class ArithmeticMainClass {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value1:");
		int v1 = s.nextInt();
		System.out.println("Engter value2:");
		int v2 = s.nextInt();
		if(v1>0 && v2>0)
		{
			System.out.println("==Choice===");
			System.out.println("1.add/n2.sub/n3.mul/n4.div/n5.modDiv");
			System.out.println("Enter the choice");
			int choice = s.nextInt();
			switch(choice)
			{
				case 1:
					Addition ad = new Addition();
					int r1 = ad.add(v1,v2);
					System.out.println("Sum:"+r1);
					break;
				case 2:
					Subtraction su = new Subtraction();
					int r2 = su.sub(v1,v2);
					System.out.println("Sub:"+r2);
					break;
				case 3:
					Multiplication mu = new Multiplication();
					int r3 = mu.mul(v1,v2);
					System.out.println("Mul:"+r3);
					break;
				case 4:
					Division di = new Division();
					float r4 = di.div(v1,v2);
					System.out.println("Div:"+r4);
					break;

				case 5:
					ModDivision md = new ModDivision();
					float r5 = md.modDiv(v1,v2);
					System.out.println("ModDiv:"+r5);
					break;
				default:
					System.out.println("Invalid Choice...");
			}
		}
		else
		{
			System.out.println("Invalid values...");
		}
	}	
}