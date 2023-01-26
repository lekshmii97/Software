package thispackage;

public class C {
int a;
int b;
public C() {
	this(10,20);
	this.print(40,60);
}
	public C(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
		
	}
	public void print(int x,int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		C ob=new C();
	
		
		

	}

}
