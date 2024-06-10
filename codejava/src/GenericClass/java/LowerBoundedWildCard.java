package GenericClass.java;

import java.util.List;

public class LowerBoundedWildCard {
	public static void displayNumber(List<? super Integer>List)
	{
	 for(Object n:List)
	 {
		 
	System.out.println(n);
	 }
	 }

}
