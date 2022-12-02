package hierarchical_inheritance;

public class savings extends account      //child class
{
  float bal=5000f;
  long accno=78648655898l;
  public void showBalance()
  {
	  System.out.println("Account No:"+accno);
	  System.out.println("Account type:saving");
	  if(bal<500)
	  {
		  System.out.println("minimum balance should be 500.");
	  }
	  else
	  {
		  System.out.println("Balance="+bal);
	  }
  }
}
