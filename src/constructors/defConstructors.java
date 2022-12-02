package constructors;

public class defConstructors 
{
	int m=100,n=200;
	defConstructors()
	{
		System.out.println("This is the default constructor of class defConstructors");
	}
public static void main(String args[])

{
	defConstructors df=new defConstructors();
	System.out.println(df.m+" "+df.n);
	classMain cm=new classMain();
	System.out.println(cm.m+" "+cm.n);
	defConstructors1 df1=new defConstructors1();
	System.out.println(df1.x+" "+df1.y);
}
} 

class classMain
{
	int m=10,n=100;
	classMain()
	{
		System.out.println("This is default constructor");
	}
	
	
}