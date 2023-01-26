package thispackage;

public class B {
	String name;
	int age;
	public void print(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void sub(float x,float y)
{
	this.add(34, 24);
	this.print("lekshmi", 25);
	
	float z=x+y;
	float avg=z/2;
	System.out.println(z);
	System.out.println(avg);
}
	public static void main(String[] args) {
		B ob=new B();
		ob.sub(2.5f,6.8f);

	}

}
