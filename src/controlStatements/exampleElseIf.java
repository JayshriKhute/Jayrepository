package controlStatements;

public class exampleElseIf
{
	public static void main(String[] args)
	{
		
	
        int marks=80;
        if(marks>=65)
        {
        	
	       System.out.println("First class with distinction");

	    }
        else if(marks>=60 && marks<65)
        {
        	System.out.println("First class");
        }
        else if(marks>=50 && marks<60)
        {
        	System.out.println("Second class");
        }
        else if(marks>=35 && marks<50)
        {
        	System.out.println("Pass class");
        }
        else
        {
        	System.out.println("Fail");
        }
}

    
}
