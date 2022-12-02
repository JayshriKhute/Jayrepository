package AccessSpecifiers;

public class public1   //public access specifier
{
	public int x=100,y=200;
	
	public public1()
	{
		System.out.println("This is public constructor");
	}
	
	public void m1()
	{
		System.out.println("This is public method");
	}
  public static void main(String[] args) 
  {
	public1 p1=new public1();
	p1.m1();
	System.out.println(p1.x+"  "+p1.y);
  }
}
