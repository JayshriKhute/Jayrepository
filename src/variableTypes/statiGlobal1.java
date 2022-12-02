package variableTypes;

public class statiGlobal1 
{
  static int a=50;  //static global variable
      
  public static void main(String args[])
  {
	  System.out.println("static global variable from same class="+a);
	  
	  
	  
	  System.out.println(".......................");
	  
	
	  
	  System.out.println("static gloabal variable from diif class="+staticGlobal2.f1);
  }
}
