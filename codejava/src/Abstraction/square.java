package Abstraction;

public class square extends shape {
    private float side;
//default consturctor 
	public square()
	{
		side=7.08f; 
	}
	//parameterized consturctor
	public square(float side)
	{
		this.side=side;
	}
	@Override
  void calArea()
  {
		super.area=side*side;
  }
}
