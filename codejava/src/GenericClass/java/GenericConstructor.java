package GenericClass.java;

public class GenericConstructor {
	private double v;
	public  <T extends Number> GenericConstructor(T t)
	{
		v=t.doubleValue();
				
	}
	void display()
	{
		System.out.println("The Number are change into double value:"+v);
	}
	

}
