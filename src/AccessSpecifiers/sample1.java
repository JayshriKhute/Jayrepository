package AccessSpecifiers;


//private access specifier
public class sample1 
{
  private int a=100;
  
  private sample1()
  {
	  System.out.println("Private constructor");
	  System.out.println(a);
	  System.out.println();
  }
  private void display()
  {
	  System.out.println("Private method");
	  System.out.println(a);
	  System.out.println();
  }
  public static void main(String[] args)
  {
	  sample1 s1=new sample1();
	  System.out.println(s1.a);
	  s1.display();
	  int m=main(88);
	  System.out.println(m);
	
  }
  private static int main(int a)
  {
	  
	  System.out.println("overriding main method");
	 
	  return a;
  }
}
