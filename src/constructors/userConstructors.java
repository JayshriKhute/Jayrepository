package constructors;

public class userConstructors 
{
  int a,b;
  char ch1,ch2;
  userConstructors()
  {
	  a=50;
	  b=100;
	  ch1='x';
	  ch2='y';
  }
  
  public void showChars()
  {
	  System.out.println(ch1+" "+ch2);
  }
  public void showNumbers()
  {
	  System.out.println(a+" "+b);
  }
  public static void main(String args[])
  {
	  userConstructors uc=new userConstructors();
	  System.out.println("Characters:");
	  uc.showChars();
	  System.out.println("...........................");
	  System.out.println("Numbers:");
	  uc.showNumbers();
	  System.out.println("...........................");
	  System.out.println("Addition:");
	  uc.addition();
	  System.out.println("...........................");
	  System.out.println("subtraction:");
	  uc.subtraction();
	  System.out.println("...........................");
	  System.out.println("Multiplication:");
	  uc.multiplication();
  }
  public void addition()
  {
	  System.out.println("a+b="+(a+b));
  }
  public void multiplication()
  {
	  System.out.println("a*b="+(a*b));
  }
  public void subtraction()
  {
	  System.out.println("a-b="+(a-b));
  }
}
