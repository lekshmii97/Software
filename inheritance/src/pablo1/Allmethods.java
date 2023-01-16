package pablo1;

public class Allmethods 
{


public void add()
{
	System.out.println("lekshmi");
}
private void sub()
{
	System.out.println("bhavika");
}
protected void mul()
{
	System.out.println("vasishta");
}
void div()//default
{
	System.out.println("parvathy");
}


public static void main(String[] args)
{
Allmethods ob=new Allmethods();
	ob.add();
	ob.mul();
	ob.div();
	ob.sub();
}
}
