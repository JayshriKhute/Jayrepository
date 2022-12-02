package polymorphism;

public class methodoverloading 
{
  public void area(int r)
  {
	  System.out.println("Area of circle="+3.14*r*r+"\n");
  }
  public void area(int l,int b)
  {
	  System.out.println("Area of rectangle="+(l*b)+"\n");
  }
  public void area(float l)
  {
	  System.out.println("Area of rectangle="+l*l+"\n");
  }
  
  
  public static void main(String args[])
  {
	  methodoverloading m1=new methodoverloading();
	  m1.area(45.23f);
	  m1.area(7);
	  m1.area(10, 20);
  }
}
