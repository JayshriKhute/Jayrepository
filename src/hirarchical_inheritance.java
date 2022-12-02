
public class hirarchical_inheritance 
{
public static void main(String args[])
{
	son s1=new son();
	daughter d1=new daughter();
	
	System.out.println("Son's property:");
	s1.car();
	s1.home();
	s1.mobile();
	s1.money();
	
	
	System.out.println();
	System.out.println("Daughter's property:");
	d1.car();
	d1.laptop();
	d1.home();
	d1.money();
	
}

}
