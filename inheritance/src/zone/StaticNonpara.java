package zone;

public class StaticNonpara {
	
	
		static int a;
		static int b;
		static int c;
		public static void add()
		{
			c=a+b;
			System.out.println(c);
		}
		public static void main(String[] args)
		{
			StaticNonpara.add();
	}

}
