package inheritance;

public class single_inheritance 
{
	public static void main(String args[])
	{
	
    child ch=new child();
    System.out.println("Methods of parent class:");
    ch.home();
    ch.Money();
    ch.car();
    ch.circleArea(7);
    System.out.println("..............");
    System.out.println("Methods of child class:");
    ch.mobile();
    
    ch.addition();
    
    System.out.println(ch.m);
    System.out.println(ch.n);
    
    
	}
}
