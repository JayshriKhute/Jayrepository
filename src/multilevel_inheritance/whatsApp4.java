package multilevel_inheritance;

public class whatsApp4 extends  whatsApp3
{
   public void status()
   {
	   
	   System.out.println("This is the fourth version of whatsApp.");
	   System.out.println("You can upload stattus in whatsApp4");
	   System.out.println("This is the latest version of whatsApp.");
   }
   
   public static void main(String args[])
   {
	   whatsApp4 w4=new whatsApp4();
	   w4.message();
	   System.out.println(".......................");
	   w4.audioCalling();
	   System.out.println(".......................");
	   w4.videocalling();
	   System.out.println(".......................");
	   w4.status();
   }
}
