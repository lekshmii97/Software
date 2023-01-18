package multilevel;

public class Employee2 extends Employee{

	 int hra;
	 int pf;
	
public void print()
{
	
super.add();

hra=(5*pay)/100;

pf=(20*pay)/100;

System.out.println("hra="+hra);
System.out.println("pf="+pf);

}

public static void main(String[] args)
{
	Employee2 sc=new Employee2();
	sc.print();
	
}
}