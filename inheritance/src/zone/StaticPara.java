package zone;

public class StaticPara {
	static int a;
	static int b;
	static int c;
	public static void add(int x,int y)
	{
		a=x;
		b=y;
		c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		StaticPara.add(4, 6);

	}

}
