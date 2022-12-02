package strings;

public class stringMethods 
{
    public static void main(String args[])
    {
    	String s1="ABC";
    	String s2="ABC";
    	String s3="XYZ";
    	String s4="CBA";
    	String s5="xyz";
    	String s6="Atharva";
    	
    	String s7="Atharva@25";
    	String s8="My name is Atharva";
    	String s9="Khute";
    	String s10="";
    	System.out.println(s1.length());
    	System.out.println(s1.equals(s2));   //compairing String data
    	System.out.println(s1.equals(s4));
    	System.out.println(s3.equals(s5));
    	System.out.println(s3.equalsIgnoreCase(s5));    //compairing String data without checking
    	System.out.println(s5.toUpperCase());           //case of letters
    	System.out.println(s1.toLowerCase());
    	System.out.println(s6.toUpperCase());
    	System.out.println(s7.toUpperCase());
    	System.out.println(".............................");
    	System.out.println(s6.concat(" ").concat(s9));
    	System.out.println(s3.charAt(2));
    	System.out.println(s3.startsWith("X"));
    	System.out.println(s6.endsWith("va"));
    	System.out.println(s8.indexOf('i'));
    	System.out.println(s8.indexOf('a'));
    	System.out.println(s8.lastIndexOf('a'));
    	System.out.println(s8.substring(3, 7));
    	System.out.println(s10.isEmpty());
    	System.out.println(s9.isEmpty());
    	System.out.println(s7.contains("@25"));
    	System.out.println(s8.contains("name is"));
    	System.out.println(s8.substring(3));
    	
    	

    	
    }
}
