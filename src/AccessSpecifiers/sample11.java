package AccessSpecifiers;

public class sample11 
{
private int num;
private sample11()
{
	num=100;
}
private void m1()
{
	System.out.println(num);
}
public static void main(String[] args) 
{
	sample11 s11=new sample11();
	s11.m1();
	System.out.println(s11.num);
}
}
