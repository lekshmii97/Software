package zone;

public class InstanceReturn {
	public int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		InstanceReturn ob=new InstanceReturn();
		int z=ob.add(4, 8);
		System.out.println(z);

	}

}
