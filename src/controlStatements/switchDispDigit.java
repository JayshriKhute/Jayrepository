package controlStatements;

public class switchDispDigit 
{
public static void main(String[] args) 
{
	int no=6353466;
	int rem,rev=0;
	System.out.println("Number is: "+no);
	System.out.println("The digits of the number are:");
	while(no!=0)
	{
		rem=no%10;
		rev=rev*10+rem;
		no/=10;
	}
	int no1=rev;
	
	
	while(no1!=0)
	{
		rem=no1%10;
		switch(rem) 
		{
		case 0:System.out.println("Zero");
        break;
        
 case 1:System.out.print("one  ");
      break;
 case 2:System.out.print("two  ");
      break;
 case 3:System.out.print("three  ");
      break;
 case 4:System.out.print("four  ");
      break;
 case 5:System.out.print("five  ");
      break;
 case 6:System.out.print("six  ");
      break;
 case 7:System.out.print("seven  ");
      break;
 case 8:System.out.print("eight  ");
      break;
 case 9:System.out.print("nine  ");
      break;
      
 default:System.out.println("Invalid Input");
 }
		no1/=10;
	}
}
}
