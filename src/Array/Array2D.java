package Array;

public class Array2D 
{
  public static void main(String ar[])
  {
	  int a[][]=new int[2][2];
	  a[0][0]=10;
	  a[0][1]=80;
	  a[1][0]=60;
	  a[1][1]=40;
	  System.out.println("....Printing 2D Array.....");
	  
	  for(int i=0;i<=1;i++)
	  {
		  for(int j=0;j<=1;j++)
		  {
			  System.out.print(a[i][j]+"  ");
		  }
		  System.out.println();
	  }
  }
}
