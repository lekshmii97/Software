package multilevel;

public class Employee3 extends Employee2
{
int total;

public void prime()
{
System.out.println(super.ded);
System.out.println(super.bonus);
System.out.println(super.hra);
super.print();

	total=pay+hra+bonus-ded-pf;
	
}
public static void main()
{
	Employee3 sc=new Employee3();
	sc.prime();
}
}