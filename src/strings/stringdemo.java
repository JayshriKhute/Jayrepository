package strings;

public class stringdemo 
{
  public static void main(String args[])
{
	    String s1="Atharva";   //store in constant pool area
	    String s2="Atharva";
	    String s3="Parvini";
	    
	    String s4=new String("Atharva");  //store in non-constant pool area
	    String s5=new String("Atharva");
	    String s6=new String("Swara");
	    
	    System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+" ");
	    
	    System.out.println(s1==s2);   //compairing addresses of String objects
	    System.out.println(s1==s3);
	    System.out.println(s1==s4);
	    System.out.println(s5==s4);
	    System.out.println(s1.length());
}
}
