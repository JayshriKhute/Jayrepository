package strings;

public class VowelsInAString 
{
   public static void main(String args[])
   {
	   boolean res=stringContainsVowels("Jklmnbagft");
	   if(res==true)
	   {
	      System.out.println("String contains vowels."); 
	   }
	   else
	   {
		   System.out.println("String does not contain vowels.");
	   }
   }
   
   public static boolean stringContainsVowels(String str)
   {
	   boolean result=str.toUpperCase().matches(".*[AEIOU].*");
	   return result;
   }
}
