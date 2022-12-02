package Array;

import java.util.Arrays;

public class min_maxOfArray 
{
  public static void main(String args[])
  {
	  int a[]= {8,3,5,7,1,9,5,3,7,0};
	  System.out.println(".....All array elements.......");
	  int sum=0;
	  for(int i=0;i<=a.length-1;i++)
	  {
		  System.out.print(a[i]+"  ");
		  sum=sum+a[i];
	  }
	  System.out.println();
	  Arrays.sort(a);
	  System.out.println("......Array in ascending order.....");
	  for(int i=0;i<=a.length-1;i++)
	  {
		  System.out.print(a[i]+"  ");
	  }
	  System.out.println();
	  System.out.println("......Array in descending order.....");
	  for(int i=a.length-1;i>=0;i--)
	  {
		  System.out.print(a[i]+"  ");
	  }
	 
	  System.out.println();
	  System.out.println("Sum of array="+sum);
	  System.out.println("Min of array="+a[0]);
	  System.out.println("Max of array="+a[a.length-1]);
	  
  }
}
