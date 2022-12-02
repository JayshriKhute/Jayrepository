package polymorphism;

public class son extends parent
{
     public void car()     //overriden method of parent class
     {
    	 System.out.println("Son's car");
     }
     
     public void money()        //overriden method of parent class
     {
    	 System.out.println("Son's money");
     }
     
     public void bike()        
     {
    	 System.out.println("Son's car");
     }
     
     public static void main(String args[])
     {
    	 son s1=new son();
    	 s1.car();
    	 s1.money();
    	 s1.bike();
    	 System.out.println();
    	 parent p1=new parent();
    	 p1.car();
    	 p1.money();
    	 
     }
}
