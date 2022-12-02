package strings;

public class stringReverse 
{
public static void main(String[] args) 
{

		String s1="Atharva";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);
		//if(rev.equals(s1))
		
			//System.out.println(s1+" is palindrome.");
		
		//else
			//System.out.println(s1+" is not palindrome.");
}


}
