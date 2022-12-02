package AccessSpecifiers;

public class sample2 
{
	int m=10;
	sample2()   //default access specifier
	{
		System.out.println(m);
	}
	void display()
	{
		System.out.println(m);
	}
	public static void main(String args[])
	{
	sample2 s2=new sample2();
	System.out.println(s2.m);
	System.out.println();
	s2.display();
			
	}

}
