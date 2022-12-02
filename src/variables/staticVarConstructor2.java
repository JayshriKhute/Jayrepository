package variables;

public class staticVarConstructor2 
{
public static void main(String args[])
{
	staticVarConstructor1 svc1=new staticVarConstructor1(100,"Atharva","Jr.KG",89.99f,"Mrs.carolin");
	staticVarConstructor1 svc2=new staticVarConstructor1(100,"Aadhya","Jr.KG",87.67f,"Mrs.Carolin");
	staticVarConstructor1 svc3=new staticVarConstructor1(100,"Kavya","Jr.KG",88.99f,"Mrs.siya");
	staticVarConstructor1 svc4=new staticVarConstructor1(100,"Parvini","Jr.KG",99.89f,"Mrs.Siya");
	staticVarConstructor1 svc5=new staticVarConstructor1(100,"Rushank","Jr.KG",98.99f,"Mrs.Aakanksha");
  
    svc1.showstudDetails();
    svc2.showstudDetails();
    svc3.showstudDetails();
    svc4.showstudDetails();
    svc5.showstudDetails();

}
}
