package TypeCasting;

public class typecastingDemo 
{
   public static void main(String ars[])
   {
	   System.out.println("Before typecasting:");
	   son s=new son();
	   s.home();
	   s.car();
	   s.money();
	   s.mobile();
	   System.out.println();
	   System.out.println("After typecasting:");
	   father s1=new son();     //reference is of parent class and 
	                            //object is of child class
	   
	   s1.home();
	   s1.car();
	   s1.money();
	   ///s1.mobile();   cannot access because we gave reference of 
	                     //parent class
   }
}
