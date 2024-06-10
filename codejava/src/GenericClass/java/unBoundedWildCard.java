package GenericClass.java;

import java.util.List;

public class unBoundedWildCard {
	public static void display(List<?>ll)
	{
		for(Object o:ll)
		{
		System.out.println(o);
		}
	}

}
