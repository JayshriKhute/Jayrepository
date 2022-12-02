package variables;

public class paraMethods 
{
	public static void main(String[] args) 
	{
		
		addition(100, 200);
		addition(1000, 2000);
		
		
		paraMethods p1=new paraMethods();
		p1.subt(700, 658);
		
		p1.addition1(10, 20, 30, 40);
		
	}
	public static void addition(int n1, int n2)
	{
		
		//parameterized method body
		
		int add=n1+n2;
		System.out.println("Addition of "+n1+" and "+n2+" is "+add);
		
	}
	
	public void subt(int n1, int n2)
	{
		
		//parameterized method body
		
		int s=n1-n2;
		System.out.println("Subtraction of "+n1+" and "+n2+" is "+s);
	}
	public void addition1(int n1, int n2,int n3,int n4)
	{
		
		//parameterized method body
		
		int add=n1+n2+n3+n4;
		System.out.println(+n1+"+"+n2+"+"+n3+"+"+n4+"="+add);
	}
	
	

}
