package exceptionHandling;

public class Arrayexception
{
   public static void main(String args[])

{
	 int a[]= {10,60,20,40};
	 try
	 {
		 System.out.println("Before exception occur.");
		a[5]=90;
		System.out.println("After exception occur.");
		
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println("Exception caught");
	 }
	 System.out.println("Hello");
	 System.out.println("Hi");
}
}