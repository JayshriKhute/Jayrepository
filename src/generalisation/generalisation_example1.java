package generalisation;

public class generalisation_example1 
{
  public static void main(String args[])
  {
	  currentAcc c1=new currentAcc();
	  savingAcc s1=new savingAcc();
	  salaryAcc sal=new salaryAcc();
	  c1.cashdeposit();
	  c1.cashWithdrawal();
	  c1.moneytransfer();
	  c1.checkBalance();
	  System.out.println();
	  c1.cashdeposit();
	  s1.cashWithdrawal();
	  s1.moneytransfer();
	  s1.checkBalance();
	  System.out.println();
	  sal.cashdeposit();
	  sal.cashWithdrawal();
	  sal.moneytransfer();
	  sal.checkBalance();
	  
  }
}
