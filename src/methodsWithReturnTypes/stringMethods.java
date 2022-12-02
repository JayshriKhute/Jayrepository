package methodsWithReturnTypes;

public class stringMethods 
{
  public static void main(String args[])
  {
	  int l1=stringLength("Jayshree");
	  System.out.println("String length="+l1);
	  System.out.println(".........................");
	  
	  stringMethods m1=new stringMethods();
	  
	  int add = m1.addition(10, 20);
	  System.out.println(add);
	  
	  float fadd=m1.addition(10.2f,20);
	  System.out.println(fadd);
	  
	  System.out.println();
	  String s2=m1.stringreverse("Atharva");
	  System.out.println("Reverse String="+s2);
	  System.out.println(".......................");
	  String a[]= {"ram","shyam","ajay","atul"};
	  int arraylength=arrayLength(a);
	  System.out.println("Length of the array="+arraylength);
  }
  
  public static int stringLength(String s1)
  {
	  return s1.length();
  }
  
  public String stringreverse(String s1)
  {
	  String rev="";
	  
	  for(int i=s1.length()-1;i>=0;i--)
	  {
		  rev=rev+s1.charAt(i);
	  }
	  return rev;
  }
  public static int arrayLength(String sarr[])
  {
	  return sarr.length;
  }
  
  public int addition(int a,int b)
  {
	  return a+b;
  }
  public float addition(float a,float b)
  {
	  return a+b;
  }
}
