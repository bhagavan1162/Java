package test;
public class Deposit implements Transaction {
	public void process(int amt)
	{
		
		System.out.println("Amount Withdrawn: "+amt);
		b.bal=b.bal-amt;
		System.out.println("Balance amount: "+b.getBalance());
		System.out.println("Transaction Completed");
		
	}
}
