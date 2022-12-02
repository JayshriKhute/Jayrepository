package Array;

import java.util.Arrays;
public class sorting_String_Array
{
	public static void main(String args[])
	{
		String s[]= {"Anurag","Aniruddha","Avinash","Avnish","Anvit","Atharva"};
		System.out.println("Original array:");
		for(int i=0;i<=s.length-1;i++)
		{
			System.out.print(s[i]+"  ");
		}
		System.out.println();
		System.out.println("Size pf array="+s.length);
		Arrays.sort(s);
		System.out.println("....Array in ascending order.....");
		for(int i=0;i<=s.length-1;i++)
		{
			System.out.print(s[i]+"  ");
		}
		System.out.println();
		System.out.println("....Array in descending order.....");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+"  ");
		}
	}

}
