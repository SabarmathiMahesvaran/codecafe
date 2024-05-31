package StaticBlockMethod;

public class MyClass {
	private int section;
	private static int srno;
	//Now we create the static block
	static
	{
		System.out.println(".......Within static block......");
		srno=1000;
	}
	//Now we create the default constructor
  MyClass()
  {
	  System.out.println("...........Within the Default constructor.........");
	  section++;
	  srno++;
  }
  //Now we call the toString method
  @Override
  public String toString()
  {
	  return "MyClass [Section="+section+"\tSerial no="+srno+"]";
  }
  //Now we display
  static void display()
  {
	  //System.out.println("section="+section);
	  System.out.println("Serial no="+srno);
  }
}
