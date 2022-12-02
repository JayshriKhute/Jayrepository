package variables;

public class staticVarConstructor1 
{
static int rno;
String name;
String classname;
Float percentage;
 static String principleName;

staticVarConstructor1(int n,String sname,String cname,float per,String pname)
{
	rno=n;
	name=sname;
	classname=cname;
	percentage=per;
	principleName=pname;
}

public void showstudDetails()
{
	System.out.println(rno+"    "+name+"     "+classname+"      "+percentage+"     "+principleName);
	rno++;
}
}
