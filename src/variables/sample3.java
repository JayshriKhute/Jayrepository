package variables;

public class sample3 
{
public static void main(String[] args) 
{
	
	System.out.println("This is main method of class sample3");
	System.out.println("......................................");
	m1();         //calling static regular method from same class
	
	System.out.println("......................................");
	
	sample2.m3();//calling static regular method from different class
	System.out.println("......................................");
	
	sample2 s2=new sample2();
	s2.m4();     //calling non-static regular method from different class
	System.out.println("......................................");
	
	sample3 s3=new sample3();
	s3.m2();      //calling non-static regular method from same class
}
public static void m1()
{
	System.out.println("This is static regular method m1 from same class");
}
public void m2()
{
	System.out.println("This is no-static regular method m2 from same class");
}
}
