package methodoverriding;

public class Over2 extends Over1 {

	public void print()
	{
		super.print();
		System.out.println("Today");
	}
	public static void main(String[] args) {
		Over2 sc=new Over2();
		sc.print();
		

	}

}
