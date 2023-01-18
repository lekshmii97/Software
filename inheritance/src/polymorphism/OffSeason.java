package polymorphism;

public class OffSeason extends OnSeason {
	
	int disc;
	public void discount()
	{
		super.discount();
		disc=(price*15)/100;
	}

	public static void main(String[] args) {
		
		OffSeason sc=new OffSeason();
		sc.discount();
		

	}

}
