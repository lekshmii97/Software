package inheritance;

public class Child2 extends Child1
	{

		int g=4;
		int h=400;
		int j;
	
	public void div()
	{
	j=h/g;
	System.out.println(j);
	}
	public static void main(String[] args)
	{
		
	
	Child2 obj=new Child2();
	obj.div();
	obj.add();
	obj.sub();


}
	}
