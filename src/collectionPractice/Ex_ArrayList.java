package collectionPractice;

import java.util.ArrayList;

public class Ex_ArrayList
{
  public static void main(String args[])
  {
	  ArrayList al=new ArrayList();
	  
	  System.out.println("Initial ArrayList size:"+al.size());
	  al.add(21);
	  al.add("Atharva");
	  al.add("87.89f");
	  al.add('A');
	  al.add(null);
	  al.add(null);
	  al.add(null);
	  
	  System.out.println(al);
	  System.out.println("ArryList size:"+al.size());
	  if(al.isEmpty())
	  {
	  System.out.println("ArrayList is not empty.");
	  }
	  else
	  {
		  System.out.println("ArrayList is not empty.");
	  }
	  System.out.println(al.contains("Atharva"));
	  System.out.println(al.contains(21));
	  System.out.println(al.get(4));
	  al.set(3,"Jayshri");
	  System.out.println(al);
	  al.add(3,"Mukundraj");
	  System.out.println(al);
	  al.remove(7);
	  System.out.println(al);
			  
  }
}
