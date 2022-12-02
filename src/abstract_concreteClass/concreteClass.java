package abstract_concreteClass;

public class concreteClass extends abstractClass
{
  
     public void m4()
    {
    	System.out.println("abstract method m4 completed in concreteClass");
    }
    
     public void m5()
    {
    	 System.out.println("abstract method m5 completed in concreteClass");
    }
    public static void main(String args[])
    {
    	concreteClass cc1=new concreteClass();
    	
    	cc1.m1();
    	cc1.m2();
    	cc1.m3();
    	cc1.m4();
    	cc1.m5();
    	
    	main(50);
    	main("Raghav");
    }
	public static void main(int n)
	{
		System.out.println(n);
	}
	public static void main(String s1)
	{
		System.out.println(s1);
	}
}
