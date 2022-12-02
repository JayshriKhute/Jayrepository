package variables;

public class useOfStatic1 
{
  public static void main(String args[])
  {
	  
	 
	  useOfstaticVariables sv1=new useOfstaticVariables();
	  sv1.id=1001;
	  sv1.name="Mukundraj";
	  sv1.salary=100000f;
	  useOfstaticVariables.ceoName="Abid Namuchiwala";
	  
	  useOfstaticVariables sv2=new useOfstaticVariables();
	  sv2.id=1002;
	  sv2.name="Jayshree";
	  sv2.salary=50000f;
	  useOfstaticVariables.ceoName="Abid namuchiwala";
	  
	  useOfstaticVariables sv3=new useOfstaticVariables();
	  sv3.id=1003;
	  sv3.name="Sanjiwani";
	  sv3.salary=70000f;
	  useOfstaticVariables.ceoName="Abid Namuchiwala";
	  
	  useOfstaticVariables sv4=new useOfstaticVariables();
	  sv4.id=1004;
	  sv4.name="Sumeetra";
	  sv4.salary=200000;
	  useOfstaticVariables.ceoName="Ratan Tata";
	  
	  useOfstaticVariables sv5=new useOfstaticVariables();
	  sv5.id=1005;
	  sv5.name="Rashi";
	  sv5.salary=200000;
	  useOfstaticVariables.ceoName="xyz";
	  
	  sv1.showEmpDetails();
	  sv2.showEmpDetails();
	  sv3.showEmpDetails();
	  sv4.showEmpDetails();
	  sv5.showEmpDetails();
	  
	 
  }
}
