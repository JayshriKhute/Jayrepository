package Array;

public class stringArray 
{
  public static void main(String args[])
  {
	  String arr[]=new String[5];
	  arr[0]= "Atharva";
	  arr[1]= "Kavya";
	  arr[2]= "Parvini";
	  arr[3]= "Rushank";
	  arr[4]= "Samaira";
	  
	  //String a[]= {"Ram","Shyam","Akshay","Ganesh","Hari"};
	  
	 
			  
	  
	  System.out.println("......All array elements.........");
	  for(int i=0;i<=arr.length-1;i++)
	  {
		  System.out.print(arr[i]+"  ");
	  }
	  System.out.println();
	  System.out.println("......Reverse array elements.........");
	  for(int i=arr.length-1;i>=0;i--)
	  {
		  System.out.print(arr[i]+"  ");
	  }
  }
}
