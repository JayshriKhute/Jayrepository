package methodsWithReturnTypes;

import java.util.Arrays;

public class arrayWithMethods
{
  public static void main(String args[])
  {
  int arr[]= {54,87,5,9,5,78,99,3,76,97,12,67,90};
  int arr1[]= {56,7,8,4,65,77,22,44,98,12,54,88};
  arrayWithMethods a1=new  arrayWithMethods();
  int l1=a1.arrayLength(arr);
  System.out.println("Length of the array="+l1);
  System.out.println("..............");
  int max=a1.maxOfArray(arr);
  System.out.println("Maximum element in arry="+max);
  System.out.println("..............");
  int min=a1.minOfArray(arr);
  System.out.println("Minimum element in arry="+min);
 
 System.out.println("......................");
 System.out.println(a1.arrayEquals(arr, arr1));
  
  }
  public int arrayLength(int m[])
  {
	  return m.length;
  }
  public int maxOfArray(int m[])
  {
	  int max=m[0];
	  for(int i=0;i<m.length;i++)
	  {
		  if(m[i]>max)
			  max=m[i];
	  }
	  return max;
  }
  public int minOfArray(int m[])
  {
	  int min=m[0];
	  for(int i=0;i<m.length;i++)
	  {
		  if(m[i]<min)
			  min=m[i];
	  }
	  return min;
  }
 
  public boolean arrayEquals(int a[],int b[])
  {
	  return (Arrays.equals(a, b));
  }
  }
 


