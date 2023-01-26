package exception;

public class Venis {
	
	
	public void print()
	{
		try {
			
		int a;
	a=10/0;
	
	}
		catch(Exception e) {
			System.out.println("exception handled");
		}
	}
	public static void main(String[] args) {
		Venis ob=new Venis();
		ob.print();

	}

}
