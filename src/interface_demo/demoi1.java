package interface_demo;

public class demoi1 implements i1 
{
     public void m1()
     {
    	 System.out.println("Incomplete method m1 of interface i1 completed in"
    	 		+ "demoi1 class.");
     }
    	 public void m2()
    	 {
    		 System.out.println("Incomplete method of m2 interface i1 completed in"
    	    	 		+ "demoi1 class.");
    	 }
    	 public void m3(int s)
    	 {
    		 System.out.println(s);
    	 }
    	 
    	 public static void main(String args[])
    	 {
    		 demoi1 d1=new demoi1();
    		 
    		 d1.m1();
    		 d1.m2();
    		 System.out.println(a);
    		 System.out.println(f1);
    		 d1.m3(9);
    		
    	 }
    	 
     
}
