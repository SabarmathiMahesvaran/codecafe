package GenericClass.java;
import java.util.Arrays;
import java.util.List;

public class LowerBoundedWilCardExample {

	public static void main(String[] args) {
		List<Integer>intList=Arrays.asList(1,2,3,4);
		System.out.println("display the Integer value");
		//Now we call the LowerBoundedWildCard class
		LowerBoundedWildCard.displayNumber(intList);
		List<Number>NumList=Arrays.asList(10.4,15.10,10,50);
		System.out.println("display the Number value");
		LowerBoundedWildCard.displayNumber(NumList);
	}

}
