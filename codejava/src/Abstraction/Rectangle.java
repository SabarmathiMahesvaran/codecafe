package Abstraction;

public class Rectangle extends shape {
	private float width,height;
	//default constructor
	public Rectangle()
	{
		width=27.8f;
		height=32.5f;
	}
	//We created the parameterized constructor
	public Rectangle(float width,float height )
	{
		this.width=width;
		this.height=height;
	}
	@Override
	void calArea()
	{
		super.area=width*height;
	}

}
