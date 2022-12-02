
public class Constructors 
{
     int a=100;
     static int b=200;
     Constructors()
     {
    	 System.out.println(a);
    	 a++;
    	 
    	 b++;
     }
     public void display()
     {
    	 System.out.println(a);
    	 
    	 System.out.println(b);
    	 
     }
     public static void main(String args[])
     {
    	 Constructors c1=new Constructors();
    	 c1.display();
    	 System.out.println("..................");
    	 Constructors c2=new Constructors();
    	 c2.display();
    	 System.out.println("....................");
    	 Constructors c3=new Constructors();
    	 c3.display();
    	 
     }
}
