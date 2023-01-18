package multilevel;

public class Employee3 extends Employee2
{
  int totalsalary;

public void primer()
{
	super.print();
	
	

}
public void given()
{

totalsalary=pay+hra-pf-ded+bonus;
System.out.println("totalsalary="+totalsalary);	
	
}
public static void main(String[] args)
{
	Employee3 sc=new Employee3();
	sc.primer();
	

	sc.given();
}
}