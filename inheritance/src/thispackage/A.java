package thispackage;

public class A {
	String name;
	int age;
	public A(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
public void print()
{
	System.out.println(name+" "+age);
}

	public static void main(String[] args) {
	A ob=new A("lekshmi",25);
	ob.print();

	}

}
