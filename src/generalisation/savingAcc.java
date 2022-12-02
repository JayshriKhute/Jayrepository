package generalisation;

public class savingAcc implements  Account
{
	
	
		float bal=100;

		 public void cashdeposit() 
		 {
			 System.out.println("CD:30000");
		 }
		 public void cashWithdrawal()
	     {
	    	System.out.println("CW:150000"); 
	     }
	     
	    public void moneytransfer()
	     {
	    	 System.out.println("MT:60000");
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