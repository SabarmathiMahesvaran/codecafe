package GenericClass.java;

public class GenericMethod {
	public<E> void displayArrayElement(E[]element) {
		for(E element1:element)
		{
			System.out.println("Element is:"+ element1);
		}
			
	}
	
	
}
