package exceptionHandling;

public class genericException 
{
	public static void main(String arhs[])
	{
		int m=10,n=0;
		
		try
		{
			int div=m/n;
			System.out.println(div);
		}
		catch(Exception e)
		{
		e.printStackTrace();
		System.out.println("Generic exception handled.");
		}
		
	}

}
