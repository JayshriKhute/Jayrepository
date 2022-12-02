package hierarchical_inheritance;

public class hierachical         //main method class
{
	
	  public static void main(String args[])
	  {
		 
		 
		  System.out.println();
		  savings s1=new savings();
		  current c1=new current();
		  
		  s1.ShowDetails();
		 
		  s1.showBalance();
		  
		  System.out.println("..........................");
		  c1.ShowDetails();
		  
		  c1.showBalance();
		  
	  }
}
