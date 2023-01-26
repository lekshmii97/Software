package zone;

public class Aggregate {
public String house;
public int pin;
Aggre sd;
	public Aggregate(String house,int pin,Aggre sd)
	{
		this.house=house;
		this.pin=pin;
		this.sd=sd;
		
	}
	
	public  void print()
	{
		System.out.println(sd.name+" "+sd.age);
		System.out.println(house+" "+pin);
	}
	public static void main(String[] args) {
		Aggre sc=new Aggre("bhavika",6);
		Aggregate sc1= new Aggregate("bhavan",6868,sc);
				sc1.print();

	}

}
