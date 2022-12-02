package superThis;

public class useSuperThis1 extends useSuperThis
{
int n=100;

public void method1()
{
	int n=1000;
	
	System.out.println(n);          //local variable of method1
	System.out.println(this.n);      //global variable of same class
	System.out.println(super.n);      //global variable of super class
}
public static void main(String args[])
{
	
	useSuperThis1 ust1=new useSuperThis1();
	ust1.method1();
	
	
}
}
