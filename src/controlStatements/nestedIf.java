package controlStatements;

public class nestedIf 
{
	public static void main(String[] args)
	{
		
	
       int pre=480;
           if(pre>=300)
           {
        	   System.out.println("Candidate is eligible for mains exam");
        	   System.out.println("...................................");
        	   int mains=800;
        	   if(mains>=700)
        	   {
        		   System.out.println("Candidate is eligible for interview round");
        		   System.out.println("...................................");
        		   int imarks=980;
        		   if(imarks>=900)
        		   {
        			   System.out.println("Congratulations you have been selected!!!!");
        		   }
        		   else
        		   {
        			   System.out.println("You are disqualified in Interview");
        		   }
        	   }
        	   else
        	   {
        		   System.out.println("You are disqualified for Interview");
        		   
        	   }
           }
           else
           {
        	   System.out.println("Ypu are disqualified for mains exam");
        	  
           }
    }
}