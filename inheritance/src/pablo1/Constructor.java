package pablo1;

public class Constructor {
	public void add(int X,int Y)
	{
		int sum=X+Y;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
Constructor ob=new Constructor();
ob.add(4, 6);
}
}