package Array;

public class Array2DS 
{
  public static void main(String args[])
  {
	  int a[][]= {{40,50,90,80},{70,10,60,40},{20,70,40,10}};
	  
	  System.out.println("2D Array:");
	  for(int i=0;i<=2;i++)
	  {
		  for(int j=0;j<=3;j++)
		  {
			  System.out.print(a[i][j]+"  ");
		  }
		  System.out.println();
	  }
  }
}
