package maccess;
import java.util.*;
public class DemoBuffer_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		System.out.println("Default Capacity:"+sb.capacity());
		System.out.println("Length:"+sb.length());
		while(true)
		{
			System.out.println("===Choice===");
			System.out.println("1.append()\n2.insert(int)\n3.delete()\n4.reverse()\n5.exit");
			System.out.println("Enter choice:");
			int choice = Integer.parseInt(s.nextLine());
			switch(choice)
			{
			case 1: 
				System.out.println("Enter the data:");
				sb.append(s.nextLine());
				System.out.println("sb:"+sb.toString());
				System.out.println("Capacity:"+sb.capacity());
				System.out.println("Length:"+sb.length());
				break;
			case 2:
				if(sb.length()==0)
				{
					System.out.println("Buffer is Empty...");
				}
				else
				{
					System.out.println("Enter the index:");
					int index = Integer.parseInt(s.nextLine());
					if(index>=0 && index<sb.length())
					{
						System.out.println("Enter the data:");
						String str = s.nextLine();
						sb.insert(index, str);
						System.out.println("sb:"+sb.toString());
					}
					else
					{
						System.out.println("Invalid Index value...");
					}
				}
				break;
			case 3:
				if(sb.length()==0)
				{
					System.out.println("Buffer is Empty...");
				}
				else
				{
					System.out.println("Enter the start index:");
					int i1 = Integer.parseInt(s.nextLine());
					if(i1>=0 && i1<sb.length())
					{
						System.out.println("Enter the end:");
						int i2 = Integer.parseInt(s.nextLine());
						if(i2>=i1 && i2<=sb.length())
						{
							sb.delete(i1, i2);
							System.out.println("sb:"+sb.toString());
						}
						else
						{
							System.out.println("Invalid End Index...");
						}
					}
					else
					{
						System.out.println("Invalid Start Index...");
					}
				}
				break;
			case 4:
				if(sb.length()==0)
				{
					System.out.println("Buffer is Empty...");
				}
				else
				{
					sb.reverse();
					System.out.println("sb:"+sb.toString());
				}
				break;
			case 5:
				System.out.println("Operation stopped on Buffer...");
				System.exit(0);
			default :
				System.out.println("Invalid Choice...");
			}
		}
	}

}
