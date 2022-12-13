package maccess;
import test.*;
import java.util.*;
public class BankMainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c =0;
		pqr:
			while(true)
			{
				System.out.println("Enter the PinNo:");
				int pinNo = s.nextInt();
				CountDigits cd = new CountDigits();
				int count = cd.getCount(pinNo);
				if(count==4)
				{
					CheckPinNo cpn = new CheckPinNo();
					boolean k = cpn.verify(pinNo);
					if(k)
					{
						System.out.println("***Choice***");
						System.out.println("1.Withdraw\n2.Deposit");
						System.out.println("Enter the choice");
						switch(s.nextInt())
						{
						case 1:
							System.out.println("Enter the amount:");
							int a1 = s.nextInt();
							if(a1>0 && a1%100==0)
							{
								Withdraw w = new Withdraw();
								w.process(a1);
							}
							else
							{
								System.out.println("Invalid amount...");
							}
							break pqr;
						case 2:
							System.out.println("Enter the amount:");
							int a2 = s.nextInt();
							if(a2>0 && a2%100==0)
							{
								Deposit d = new Deposit();
								d.process(a2);
							}
							else
							{
								System.out.println("Invalid amount...");
							}
							break pqr;
						default:
							System.out.println("Invalid Choice...");
							break pqr;
						}
					}
					else
					{
						System.out.println("Incorrect PinNo...");
						c++;
					}
				}
				else
				{
					System.out.println("Invalid PinNo...");
					c++;
				}
				if(c==3)
				{
					System.out.println("Transaction Blocked...");
					break;
				}
			}
		s.close();
	}
}