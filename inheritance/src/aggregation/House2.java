package aggregation;

public class House2 {
	public String housename;
	public int pin;
	House1 sd; //reference variable
	
	public House2(String housename,int pin,House1 sd)

	{
		this.housename=housename;
		this.pin=pin;
		this.sd=sd;
	}
	public void print()
	{
		System.out.println(sd.name+" "+sd.age);
		System.out.println(housename+" "+pin);
	}
	
public static void main(String[] args) {
		House1 sc=new House1("Bhavika",6);
		House2 sc1=new House2("Bhavan",691302,sc);
		sc1.print();

	}

}
