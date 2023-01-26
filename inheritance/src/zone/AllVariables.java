package zone;

public class AllVariables {
	int a=5;//Instance variables
	int b=8;
	static int x=5;//static variables
	static int y=5;
	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	
public static void print()
{
	int z=x+y;
	System.out.println(z);
}
	public static void main(String[] args) {
		AllVariables ob=new AllVariables();
		ob.add();
		AllVariables.print();
		int g=8;//local variables
		System.out.println(g);

}
}
