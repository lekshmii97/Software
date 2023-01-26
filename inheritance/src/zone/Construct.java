package zone;

public class Construct {
	String name;
int sub;
public Construct(String a,int b)
{
	name=a;
	sub=b;
}
public void add()
{
	System.out.println(name+" "+sub);
	
}
	public static void main(String[] args) {
	Construct ob=new Construct("lekshmi",68);
	Construct ob1=new Construct("bhavika",68);

	ob.add();
	}

}
