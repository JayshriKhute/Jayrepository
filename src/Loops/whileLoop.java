package Loops;

public class whileLoop 
{
public static void main(String[] args) 
{
	 int i=1,j,n=10;
	 System.out.println("Printing table from 1 to 10");
	 
	 System.out.println("......................................");
	 
	 while(i<=10)
	 {
		 j=1;
		 while(j<=n)
		 {
			 System.out.print(i*j+"      ");
			 j++;
		 }
		 System.out.println("  ");
		 i++;
	 }
	 
}
}
