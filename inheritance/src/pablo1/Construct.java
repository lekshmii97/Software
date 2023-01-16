package pablo1;

public class Construct {
	String name;
	int sub1;
	int sub2;
	public Construct(String a,int b,int c)
	{
		name=a;
		sub1=b;
		sub2=c;
		
	}
public void print()
{
	System.out.println(name+" "+sub1+" "+sub2);
}
public static void main(String[] args)
{
	Construct ob=new Construct("lekshmi", 60, 65);
			Construct ob1=new Construct("Bhavika", 60, 65);
			ob1.print();
	ob.print();
}
}
