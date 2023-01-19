package encapsulation;

public class User {

	public static void main(String[] args) {
		Bank1 sc=new Bank1();
		sc.setPinnumber(6368);
		
		System.out.println(sc.getPinnumber());
		sc.validate();

	}
	
	}
