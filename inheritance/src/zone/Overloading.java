package zone;

public class Overloading {
public static void add(int x,int y)
{
	int sum=x+y;
	System.out.println(sum);
}
public static void add(float a,int b)
{
	float sub=a-b;
	System.out.println(sub);
}
	public static void main(String[] args) {
		Overloading.add(3, 4);
		Overloading.add(5.6f,4);

	}

}
