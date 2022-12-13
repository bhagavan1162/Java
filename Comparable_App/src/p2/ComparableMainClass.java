package p2;
import java.util.Scanner;
import p1.*;
public class ComparableMainClass {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value1");
		int v1 = s.nextInt();
		System.out.println("Enter value2");
		int v2 = s.nextInt();
		System.out.println("Enter value3");
		int v3 = s.nextInt();	
		if((v1>0)&&(v2>0)&&(v3>0))
		{
			if((v1==v2)&&(v2==v3))
			{
				System.out.println("Values are Same");
			}
			else
			{
				System.out.println("Enter choice:");
				int choice  = s.nextInt();
				switch(choice)
				{
					case 1:
						Greater g = new Greater();
						int r1 = g.large(v1,v2,v3);
						System.out.println("Greater is"+r1);
						break;
					case 2:
						Smaller l = new Smaller();
						int r2 = l.small(v1,v2,v3);
						System.out.println("Smaller is"+r2);
						break;
				}
			}

		}
		else
		{
			System.out.println("Invalid Values");
		}
	}
}
