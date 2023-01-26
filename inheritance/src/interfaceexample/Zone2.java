package interfaceexample;

public class Zone2 implements Zone,India
{

	public static void main(String[] args) {

		Zone2 ob=new Zone2();
		ob.noun();
		ob.print();

	}

	@Override
	public void noun() {
		System.out.println("lekshmi");
		
	}

	@Override
	public void print() {
	System.out.println("good girl");
		
	}

}
