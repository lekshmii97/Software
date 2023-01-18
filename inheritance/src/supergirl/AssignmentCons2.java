package supergirl;

public class AssignmentCons2 extends AssignmentConstructor
{
	
	public AssignmentCons2()
	{
		super(6,4);
		System.out.println(sum);
		
		
		if (sum%10==0)
		{
			System.out.println("divisbile");
		}
		else {
			System.out.println("not divisible");
			
		}
	}

	public static void main(String[] args) 
	{
		AssignmentCons2 ob=new AssignmentCons2();
	}

}
