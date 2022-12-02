
public class implementation extends studentMarks implements sports
{
	
	int total;
	float avg;
	public void resCalculate()
	{
		total=m1+m2+m3;
        avg=(total+spmarks)/3;
		 
	}
	public void showResult()
	{
		System.out.println("Total Marks obtained="+total+"/300");
		System.out.println("Percentage="+avg+"%");
		System.out.println("Result=Distinction");
	}
public static void main(String args[])
{
	implementation i1=new implementation();
	System.out.println("Rollno  | FirstName  |  LastName   "
			+ "|  science   |  Maths   |  English  |");
	System.out.println("----------------------------------------------"
			+ "----------------------------");
	
	i1.display();
	System.out.println("----------------------------------------------"
			+ "----------------------------");
	i1.resCalculate();
	i1.showResult();
	
}
}
