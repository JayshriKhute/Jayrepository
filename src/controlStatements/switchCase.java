package controlStatements;

public class switchCase 
{
public static void main(String[] args) 
{
	int inp=1;
	
	switch(inp)
	{
	case 1: System.out.println("Today is Monday");
	
	       System.out.println("It's a weekday");
	       break;
	case 2: System.out.println("Today is Tuesday");
	
           System.out.println("It's a weekday");
           break;
	case 3: System.out.println("Today is Wednesday");
	
           System.out.println("It's a weekday");
           break;
	case 4: System.out.println("Today is Thursday");
	
           System.out.println("It's a weekday");
           break;
	case 5: System.out.println("Today is Friday");
	
           System.out.println("It's a weekday");
           break;
	case 6: System.out.println("Today is Saturday");
	
           System.out.println("It's a weekday");
           break;
	case 7: System.out.println("Today is Sunday");
	
           System.out.println("It's a weekday");
           break;
           
    default:System.out.println("Invalid input");
	}
}

}
