package AccessSpecifiers;

public class sample12    //DEFAULT ACCESS SPECIFIER
{
	int n1;
	
	sample12()
	{
		n1=10;
	}
	
	void m1()
	{
		System.out.println(n1);
	}
public static void main(String[] args) 
{
	sample12 s12=new sample12();
	s12.m1();
	System.out.println(s12.n1);
}
}
