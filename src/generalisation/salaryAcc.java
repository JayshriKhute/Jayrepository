package generalisation;

public class salaryAcc implements  Account
{
	float bal=20000;
	 public void cashdeposit() 
	 {
		 System.out.println("CD:10000");
	 }
     public void cashWithdrawal()
     {
    	System.out.println("CW:50000"); 
     }
     public void moneytransfer()
     {
    	 System.out.println("MT:20000");
     }
	public void checkBalance()
	{
		if(bal<1000)
		{
			System.out.println("Insufficient balance.");
		}
		else
		{
			System.out.println("Balance="+bal);
		}
	}

	
}
