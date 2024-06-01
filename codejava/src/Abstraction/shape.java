package Abstraction;

public abstract class shape {
	
	protected float area;
	//we call the abstract method  
	 abstract void calArea();
  //now we call the normal method
	void display()
	{
		System.out.println("Value of the Area"+area);
	}

}
