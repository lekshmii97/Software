package supergirl;

public class Assignment2 extends Assignment1
{
	public void added()
	{
		super.add();
		System.out.println(super.sum);
		
	}

	public static void main(String[] args)
	{
	if(sum %10==0)
	{
			System.out.println("divisible");
	}
	else
	{
		System.out.println("Not divisible by 10");
	}
	
	}
}