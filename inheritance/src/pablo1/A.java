package pablo1;

public class A {
public static void student(String name)
{
	System.out.println(name);
}
public static void student(int id)
{
	System.out.println(id);
}
public static void student(long licence)
{
	System.out.println(licence);
}
	public static void main(String[] args) {

A ob=new A();
ob.student("lekshmi");
ob.student(6868);

ob.student(864568);
	}

}
