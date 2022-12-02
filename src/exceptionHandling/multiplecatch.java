package exceptionHandling;

public class multiplecatch 
{
  public static void main(String args[])
  {
	  String s[]= {"Atharva","Prisha","Hridha","Rushank"};
	  try
	  {
		  System.out.println(s[4]);
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.out.println(e);
	  }
	  catch(ArithmeticException a)
	  {
		  System.out.println(a);
	  }
	  catch(StringIndexOutOfBoundsException d)
	  {
		  System.out.println(d);
	  }
  }
  
}
