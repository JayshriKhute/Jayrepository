package constructors;

public class paraConstructors 
{
  int m,n;
  char ch1,ch2;
  String s1;
  paraConstructors(int a,int b)
  {
	   m=a; 
	   n=b;  
  }
  public void shownumbers()
  {
	  System.out.println(m+" "+n);
  }
  paraConstructors(char c1,char c2)
  {
	 ch1=c1;
	 ch2=c2;
	 
  }
 
  public void showChars()
  {
	  System.out.println(ch1+" "+ch2);
	  
  }
  public void showString()
  {
	  s1="Jayshree";
	  System.out.println(s1);
  }
  public static void main(String args[])
  {
	  paraConstructors pc1=new paraConstructors(10,20);
	  paraConstructors pc2=new paraConstructors('a','b');
	  
	  paraConstructors pc3=new paraConstructors('x','y');
	  pc3.showChars();
	  
	  
	  pc1.shownumbers();
	  pc2.showChars();
	  pc2.showString();
	  
  }
}
