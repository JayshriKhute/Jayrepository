package AccessSpecifiers1;

import AccessSpecifiers.public1;

public class public3 
{
public static void main(String[] args) 
{
	public1 p1=new public1();
	p1.m1();
	System.out.println(p1.x);
	System.out.println(p1.y);
	System.out.println("Addition="+(p1.x+p1.y));
}
}
