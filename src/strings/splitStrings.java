package strings;

public class splitStrings 
{
  public static void main(String []args)
  {
	  String s1="My name is Atharva";
	  String a[]=s1.split(" ");
	  System.out.println("No of words in a string:"+a.length);
	  System.out.println("No of characters in a string:"+s1.length());
	  
	  for(int i=0;i<=a.length-1;i++)
	  {
		  System.out.println(a[i]);
	  }
  }
}
