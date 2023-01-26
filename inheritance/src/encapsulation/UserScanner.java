package encapsulation;

import java.util.Scanner;

public class UserScanner {

	public static void main(String[] args)
	
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pin");
		int a=sc.nextInt();
		
		BankScanner ob=new BankScanner();
		ob.setPin(a);
		ob.validate();
		System.out.println(ob.getPin());
		
		
		

	}

}
