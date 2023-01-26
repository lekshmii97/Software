package zone;

public class SuperAll1 extends SuperAll
{
	
	public SuperAll1(int a,int b)
	{
	super(6,3);
	int c=a+b;
	System.out.println(c);
	super.sub();
	
	
	
	}



	public static void main(String[] args) {
		SuperAll1 ob=new SuperAll1(6,8);
		
	

	}

}
