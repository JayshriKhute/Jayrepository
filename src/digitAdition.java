
public class digitAdition 
{
  public static void main(String args[])
  {
	  int n=656567;
	  
	  int dsum=0,rem;
	  System.out.println("Number:"+n);
	  while(n!=0)
	  {
		  rem=n%10;
		  dsum=dsum+rem;
		  n=n/10;
	  }
	  System.out.println("sum of digits:"+dsum);
  }
}
