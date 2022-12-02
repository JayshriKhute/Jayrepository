package Array;

public class arrayAscending 
{
  public static void main(String args[])
  {
	  char ch[]=new char[10];
	  ch[0]='A';
	  ch[1]='N';
	  ch[2]='L';
	  ch[3]='I';
	  ch[4]='P';
	  ch[5]='S';
	  ch[6]='Q';
	  ch[7]='T';
	  ch[8]='B';
	  ch[9]='H';
	  System.out.println("Original Aray:");
	  for(int i=0;i<ch.length;i++)
	  {
		  System.out.print(ch[i]+"  ");
	  }
	  System.out.println();
	
	 for(int i=0;i<=ch.length-1;i++)
	 {
		 for(int j=i+1;j<=ch.length-1;j++)
		 {
			 if(ch[i]<ch[j])
			 {
				 char temp=ch[i];
				 ch[i]=ch[j];
				 ch[j]=temp;
				 
			 }
		 }
	 }
	 System.out.println("Array in descending order:");
	 for(int i=0;i<=ch.length-1;i++)
	 {
		 System.out.print(ch[i]+"  ");
	 }
	 
	 for(int i=0;i<=ch.length-1;i++)
	 {
		 for(int j=i+1;j<=ch.length-1;j++)
		 {
			 if(ch[i]>ch[j])
			 {
				 char temp=ch[i];
				 ch[i]=ch[j];
				 ch[j]=temp;
				 
			 }
		 }
	 }
	 System.out.println();
	 System.out.println("Array in ascending order:");
	 for(int i=0;i<=ch.length-1;i++)
	 {
		 System.out.print(ch[i]+"  ");
	 }
  }
}
