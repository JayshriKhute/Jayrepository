package AccessSpecifiers;

public class test1 
{
 protected int m=1000;
protected test1()
{
	System.out.println("Protected constructor");
	
}
protected void test1Display()
{
	System.out.println("protected method");
}
public static void main(String args[])
{
	test1 t1=new test1();
	t1.test1Display();
	System.out.println(t1.m);
}
}
