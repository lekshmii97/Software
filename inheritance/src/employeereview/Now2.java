package employeereview;

public class Now2 extends Now1 {
	int bonus;
	public void right()
	{
		bonus=8000;
		System.out.println(bonus);
	}

	public static void main(String[] args) {
	Now1 ob=new Now1();
	ob.print();
	ob.good();
	//ob.right();
	

	}

}
