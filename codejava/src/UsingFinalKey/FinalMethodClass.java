package UsingFinalKey;

public class FinalMethodClass {
	
	//we called the default constructor
	FinalMethodClass()
	{
		System.out.println("Final class cannot be inherited");
	}
	final int a=50;
	
	final void show()
	{
		System.out.println("a="+a);
	}

}
