package inheritance;

public class Child1 extends Grand
{

	int d=4;
	int e=5;
	int f;

	public  void sub()
	{
		 f=e-d;
		System.out.println(f);
	}
public static void main(String[] args)
{
	Child1 obj=new Child1();
	
	obj.sub();
	obj.add();
	
}
}