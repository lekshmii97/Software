package supergirl;

public class B extends A
{

	public void sub()
	{
		super.add();
		System.out.println(super.a);
		System.out.println("lekshmi");
		
		
	}
	public B()
	{super(50,30);
	
	}
	public static void main(String[] args) {
	
		B ob=new B();
		ob.sub();
		

	}

}
