package generalisation;

public class generalisation_example 
{
   public static void main(String args[])
   {
	   jio j=new jio();
	   vi v=new vi();
	   airtel a=new airtel();
	   
	   j.sms();
	   j.audiocalling();
	   j.dataRecharge();
	   j.jioTV();
	   System.out.println();
	   v.sms();
	   v.audiocalling();
	   v.dataRecharge();
	   v.viTV();
	   System.out.println();
	   a.sms();
	   a.audiocalling();
	   a.dataRecharge();
	   a.airtelTV();
   }
}
