package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
public class Colours {
	
	

	public static void main(String[] args) {
	ArrayList<String> ob=new ArrayList();
	ob.add("Red");
	ob.add("Yellow");
	ob.add("Green");
	ob.add("White");
	ob.add("Blue");
	ob.add("black");
	ob.add("purple");
	System.out.println(ob);
Iterator<String> itr=ob.iterator();
	
	ob.remove(2);
	System.out.println("Returning element"+ob.get(1));
	ob.set(1, "grey");
	for (String color:ob)
	{
		System.out.println(color);
	}

	}

	}


