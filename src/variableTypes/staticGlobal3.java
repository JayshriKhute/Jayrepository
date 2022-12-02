package variableTypes;

public class staticGlobal3
{

static int n=100;


public static void main(String args[])
{
	
	System.out.println(nonStaticGlobal1.i);
	System.out.println(n);
	
	showNumber();     //static regular method from same class
	
	staticGlobal3 g3=new staticGlobal3();
	g3.showStatic();//non static regular method from same class
	
	nonStaticGlobal1 nsg=new nonStaticGlobal1();
	System.out.println(nsg.a);
	
	g3.showNonStatic();
	
	
}
public static void showNumber()
{
	
	
	System.out.println(n);
	System.out.println(nonStaticGlobal1.i);
	System.out.println(n);
	
}
public void showNonStatic()
{
	nonStaticGlobal1 nsg1=new nonStaticGlobal1(); 
	
	System.out.println(nsg1.a);
}
public void showStatic()
{
	
	System.out.println(n);
	
}
}
