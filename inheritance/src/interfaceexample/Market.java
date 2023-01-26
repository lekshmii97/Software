package interfaceexample;

public class Market implements Vegetables{
	
	public static void main(String[] args)
	{
		Market ob=new Market();
		ob.print();
		ob.add();
	}

	@Override
	public void print() {
		System.out.println("hi");
		
	}

	@Override
	public void add() {
		System.out.println("hello");
		
	}

}
