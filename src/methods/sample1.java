package methods;

public class sample1 
{
 public static void main(String args[])
 {
	 sample2 s2=new sample2();
	 s2.showDetails(101,"Mukundraj", "Thane","Maharashtra");
	 sample1 s1=new sample1();
	 s1.studDetails(101, "Atharva", 98.99f, 'A');
	 sample2.addition(100,200,300);
 }
 public void studDetails(int rno,String name,Float per,char grade)
 {
 	System.out.println("Student Details:");
 	System.out.println("Roll no:"+rno);
 	System.out.println("Name:"+name);
 	System.out.println("Percentage:"+per);
 	System.out.println("Grade:"+grade);
 	System.out.println(".................");
 }
 
}
