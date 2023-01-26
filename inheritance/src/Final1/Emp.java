package Final1;

public class Emp extends Employe
{

	 
		final int pay=3000;
		final int workinghours=8;
		public void calculatesalary()
		{
			int salary=pay*workinghours;
			System.out.println(salary);
		}

	public static void main(String[] args)
	{
	Emp ob=new Emp();
		ob.calculatesalary();
	}
	}

