package Array;

public class arrayReverse
{
  public static void main(String args[])
  {
	  int a[]= {11,33,22,44,77,55,66,88,65,99};
	  int sum=0;
	  int l=a.length;
	  System.out.println("Original Array:");
	  System.out.print("{");
	  for(int i=0;i<l;i++)
	  {
		  System.out.print(a[i]+",");
		  sum+=a[i];
	  }
	
	  System.out.print("}  \n");
	  System.out.println("Reverse Array:");
	  System.out.print("{");
	  for(int i=l-1;i>=0;i--)
	  {
		  System.out.print(a[i]+",");
		 
	  }
	
	  System.out.print("}  \n");
	  System.out.println("Sum of array="+sum);
	  
	  int max=a[0];
	  int min=a[0];
	  for(int i=0;i<l;i++)
	  {
		  if(a[i]>max)
		  {
			  max=a[i];
		  }
	  }
	  System.out.println("Max="+max);
	  for(int i=0;i<l;i++)
	  {
		  if(a[i]<min)
		  {
			  min=a[i];
		  }
	  }
	  System.out.println("Min="+min);
  }
}
