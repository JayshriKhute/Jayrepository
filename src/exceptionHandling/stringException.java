package exceptionHandling;

public class stringException 
{
  public static void main(String args[])
  {
	  String s1="Atharva";
	  try
	  {
		  System.out.println(s1.length());
		  System.out.println(s1.charAt(9));
	  }
	  catch(StringIndexOutOfBoundsException e)
	  {
		  System.out.println("string exception caught.");
	  }
  }
}
