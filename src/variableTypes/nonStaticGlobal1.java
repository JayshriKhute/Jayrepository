package variableTypes;

public class nonStaticGlobal1 
{
 int a=95;
 static int i=25;
 public static void main(String args[])
 {
	 
	 System.out.println(i);

     System.out.println(staticGlobal2.f1);
	 
	 nonStaticGlobal1 nsg1=new nonStaticGlobal1();
	 System.out.println(nsg1.a);
	 System.out.println();
	 
	 staticGlobal2 sg2=new staticGlobal2();
	 System.out.println(sg2.f2);
	 
	 nsg1.nonStatic1();
	 
	 staticMethod1();
 }
 
 public void nonStatic1()
 {
	 System.out.println(i);
	 System.out.println(a);
	 System.out.println();
	 
 }
 public static void staticMethod1()
 {
	 
	 System.out.println(i);
	 nonStaticGlobal1 nsg1=new nonStaticGlobal1();
	 System.out.println(nsg1.a);
	 System.out.println();
	 
 }
}
