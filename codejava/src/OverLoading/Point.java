package OverLoading;

public class Point {
	private float x;
	private float y;
	//default constructor
	public Point()
	{
		x=0.0f;
		y=0.0f;
	}
	//Now parameterized constructor with one argument
	public Point(float x)
	{
		this.x=x;
		this.y=y;
	}
	//Now parameterized constructor with two arguments
	public Point(float x, float y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString()
	{
		return "point[x="+ x+",y="+ y+"]";
	}

}
