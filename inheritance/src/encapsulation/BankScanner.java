package encapsulation;

public class BankScanner
{


	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	
	public void validate()
	{
		if(pin==1001)
		{
			System.out.println("valid");
		}
		else if(pin==1234) {
			System.out.println("valid");
		}
		else if(pin==1212) {
			System.out.println("valid");
		}
		else {
			System.out.println("not valid");
		}
	}
	}


