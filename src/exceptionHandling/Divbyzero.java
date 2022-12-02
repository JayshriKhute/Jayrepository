package exceptionHandling; 

public class Divbyzero
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		try 
		{
			int div=a/b;     
			System.out.println(div);
			System.out.println("good afternoon");
		} 
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled");
		}
		
		System.out.println("good morning");
				
	}

}
