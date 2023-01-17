package supergirl;

public class ChildConst extends ConstructorSuper
{
	public  ChildConst(int a,int b)
	{
		super();
		super.Conss(6,8.8f);
		System.out.println("a="+a+" " +"b="+b);
	}
	public static void main(String[] args)
	{

     ChildConst sc=new ChildConst(4,6);
	}
}


