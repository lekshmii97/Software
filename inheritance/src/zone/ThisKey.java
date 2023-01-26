package zone;

public class ThisKey {
	

		String name;
	int sub;
	public void add(String name,int sub)
	{
		this.name=name;
		this.sub=sub;
	}
	public void print()
	{
		System.out.println(name+" "+sub);
		
	}
		public static void main(String[] args) {
		ThisKey ob=new ThisKey();
		ob.add("lekshmi",68);
		ob.print();

	}

}
