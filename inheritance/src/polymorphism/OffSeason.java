package polymorphism;

public class OffSeason extends OnSeason {
	
	int disc;
	public void discount()
	{
		super.discount();
		disc=(price*15)/100;
		System.out.println("discount offseason="+disc);
	}

	public static void main(String[] args) {
		
		OffSeason sc=new OffSeason();
		sc.discount();
		

	}

}
