package encapsulation;

public class Bank1 {

private int pinnumber;

public int getPinnumber()
{
	return pinnumber;
}

public void setPinnumber(int pinnumber) {
	this.pinnumber = pinnumber;
}
public void validate()
{
	if(pinnumber==1001)
	{
		System.out.println("valid");
	}
	else if(pinnumber==1234) {
		System.out.println("valid");
	}
	else if(pinnumber==1212) {
		System.out.println("valid");
	}
	else {
		System.out.println("not valid");
	}
}
}