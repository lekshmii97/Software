package supergirl;

public class SuperMethods extends SuperMethos
 {
int a=40;
int b=60;

public void added()
{
	super.add();
	int sum=a+b;
	System.out.println("sum="+sum);
	System.out.println(super.a);
	
}
	public static void main(String[] args)
	
	{
		SuperMethods ob=new SuperMethods();
		
				ob.added();
				
				
		

	}

}
