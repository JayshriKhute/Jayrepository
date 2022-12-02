package Loops;

public class whileLoop1 
{
	public static void main(String args[])
	{
		
	int count,i,n=1000;
	
	for( i=2;i<=n;i++)
	{
		count=0;
		
		for(int j=2;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
	
	if(count==1)
	{
		System.out.print(i+"  ");
	}
	}
	}

}
