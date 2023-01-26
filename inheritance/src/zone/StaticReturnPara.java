package zone;

public class StaticReturnPara {
	
	public static int add(int x, int y)

	{
		int sum=x+y;
		
		return sum;
	}
	public static void main(String[] args) {
	int c=StaticReturnPara.add(4, 5);
	System.out.println(c);

	}

}
