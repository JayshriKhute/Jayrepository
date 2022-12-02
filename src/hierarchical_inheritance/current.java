package hierarchical_inheritance;

public class current extends account    //child class
{
	long accno=65658723654375l;
  float bal=10000;
  public void showBalance()
  {
	  System.out.println("Account No:"+accno);
	  System.out.println("Account type:current");
	  if(bal<1000)
	  {
		  System.out.println("Minimum balance should be 1000.");
	  }
	  else
	  {
		  System.out.println("Balance="+bal);
	  }
  }
}
