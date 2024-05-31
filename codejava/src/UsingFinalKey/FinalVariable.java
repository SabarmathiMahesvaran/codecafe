package UsingFinalKey;

public class FinalVariable {
	//final key in the instance key so we must initialized the value for the variable
	final int x=50;
	//now we stable the final key so we use the static key word
	//Declare a static blank variable
	final static int y;
	//now we stable the final key so we use the static key word by initialized the value for the variable
	//Declare &initialized the variable
	final static int z=10;
	//it is the instance method
	void change()
	{
      x=40;//The final key will not reassigned the value
      y=30;//The final Static key will not reassigned the value
	}
	//now we call the tostring method
	@Override
	public String toString() {
		return "FinalVariable [x=" + x +"y="+y+"]";
	}
	 static
	 {
		 y=200;
		 z=50;//In the final static key word we already assigned the value for we not allowed again to assigned the value
		 System.out.println(y);
	 }
	}