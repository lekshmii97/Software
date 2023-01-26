package company;

public class Id2 {

	String companyname;
	int salary;
	Id sd;
	
	public Id2(String companyname,int salary,Id sd)
	
	{
		this.companyname=companyname;
		this.salary=salary;
		this.sd=sd;
	
	}
	public void print()
	{
		System.out.println(sd.name+" "+sd.id);
		System.out.println(companyname+" "+salary);
	}
	public static void main(String[] args) {
		Id sc=new Id("Lekshmi",3);
Id2 sc1=new Id2("tcs",35000,sc);
sc1.print();

	}

}


