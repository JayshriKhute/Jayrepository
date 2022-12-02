package generalisation;

public class currentAcc implements  Account
{
	float bal=5000;

	 public void cashdeposit() 
	 {
		 System.out.println("CD:20000");
	 }
     public void cashWithdrawal()
     {
    	System.out.println("CW:100000"); 
     }
     public void moneytransfer()
     {
    	 System.out.println("MT:40000");
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
